package com.ooteco.common;

import org.apache.commons.collections.MapUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.ObjectError;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 业务返回对象
 *
 * @author zk
 * @since 3.2.1
 */
public class ResponseEntity implements Serializable {
    private static final long serialVersionUID = -1706716347830236710L;

    private static final Logger logger = LoggerFactory.getLogger(ResponseEntity.class);

    private static final String PROPERTIES_FILE_VOMSG = "vomsg";

    private int code = VoCode.CODE_SUCCESS;
    private String msg = "";
    private Map<String, Object> data = new HashMap<>();

    public ResponseEntity(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResponseEntity(int code) {
        this.code = code;
        this.msg = getCodeMsg(code);
    }

    /**
     * 构建未绑定手机号对象
     *
     * @return 消息体
     * @date 2015年8月12日 下午6:28:57
     */
    public static ResponseEntity unbindMobile() {
        return new ResponseEntity(VoCode.CODE_NOT_BINDMOBILE);
    }

    /**
     * 构建成功对象
     *
     * @return 消息体
     * @date 2015年8月12日 下午6:28:57
     */
    public static ResponseEntity success() {
        return new ResponseEntity(VoCode.CODE_SUCCESS);
    }

    public static ResponseEntity success(String msg) {
        return new ResponseEntity(VoCode.CODE_SUCCESS, msg);
    }

    /**
     * 构建对象
     *
     * @param dataKey   数据键
     * @param dataValue 数据值
     * @return 返回VO对象
     * @date 2015年8月12日 下午5:40:51
     */
    public static ResponseEntity success(String dataKey, Object dataValue) {
        ResponseEntity vo = success();
        vo.addData(dataKey, dataValue);
        return vo;
    }

    /**
     * 构建对象
     *
     * @param data 数据集
     * @return 消息体
     * @date 2015年8月12日 下午5:41:54
     */
    public static ResponseEntity success(Map<String, Object> data) {
        ResponseEntity vo = success();
        vo.setData(data);
        return vo;
    }

    /**
     * 构建对象  map里可能containsKey(Cons.ERROR_KEY)
     *
     * @param map
     * @return
     */
    public static ResponseEntity build(Map<String, Object> map) {
        ResponseEntity res = ResponseEntity.success();
        if (MapUtils.isEmpty(map)) {
            return res;
        }

        if (MapUtils.isNotEmpty(map) && map.containsKey(Cons.ERROR_KEY)) {
            Object value = map.get(Cons.ERROR_KEY);
            if (value instanceof ResponseEntityEnum) {
                res = ResponseEntity.error((ResponseEntityEnum) value);
            } else if (value instanceof String) {
                res = ResponseEntity.error((String) value);
            } else {
                res = ResponseEntity.error();
            }
            map.remove(Cons.ERROR_KEY);
        } else {
            if (map.get(Cons.MAP_MSG_KEY) != null) {
                res.setMsg(map.get(Cons.MAP_MSG_KEY).toString());
            }
        }
        res.addData(map);
        return res;
    }

    /**
     * 构建失败对象
     *
     * @return 消息体
     * @date 2015年8月12日 下午6:30:07
     */
    public static ResponseEntity failed() {
        return new ResponseEntity(VoCode.CODE_FAILED);
    }

    public static ResponseEntity failed(String msg) {
        return new ResponseEntity(VoCode.CODE_FAILED, msg);
    }

    public static ResponseEntity failed(ResponseEntityEnum entityEnum) {
        return new ResponseEntity(entityEnum.getCode(), entityEnum.getMsg());
    }

    /**
     * 构建失败对象
     *
     * @return 消息体
     * @date 2015年8月12日 下午6:30:07
     */
    public static ResponseEntity signError() {
        return new ResponseEntity(VoCode.CODE_SIGN_ERROR, "签名验证失败");
    }

    public static ResponseEntity signError(String msg) {
        return new ResponseEntity(VoCode.CODE_SIGN_ERROR, msg);
    }

    public static ResponseEntity signError(ResponseEntityEnum entityEnum) {
        return new ResponseEntity(entityEnum.getCode(), entityEnum.getMsg());
    }

    /**
     * 构建错误对象
     *
     * @return 消息体
     * @date 2015年8月12日 下午6:30:28
     */
    public static ResponseEntity error() {
        return new ResponseEntity(VoCode.CODE_ERROR);
    }

    public static ResponseEntity error(String msg) {
        return new ResponseEntity(VoCode.CODE_ERROR, msg);
    }

    public static ResponseEntity error(ResponseEntityEnum entityEnum) {
        return new ResponseEntity(entityEnum.getCode(), entityEnum.getMsg());
    }

    /**
     * 添加数据
     *
     * @param dataKey   数据键
     * @param dataValue 数据值
     */
    public ResponseEntity addData(String dataKey, Object dataValue) {
        if (data == null) {
            data = new HashMap<>();
        }
        data.put(dataKey, dataValue);
        return this;
    }

    /**
     * 添加数据
     *
     * @param dataMap 数据键
     */
    public ResponseEntity addData(Map<String, Object> dataMap) {
        if (data == null) {
            data = new HashMap<>();
        }
        if (dataMap != null) {
            data.putAll(dataMap);
        }
        return this;
    }

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(int code) {
        this.code = code;
        setMsg(getCodeMsg(code));
    }

    /**
     * @return the msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * @param msg the msg to set
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * @return the data
     */
    public Map<String, Object> getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    private void setData(Map<String, Object> data) {
        this.data = data;
    }

    /**
     * 构建结果码消息
     *
     * @param code 结果码
     * @return 消息
     */
    public static final String getCodeMsg(int code) {
        String msg = "";
        try {
            msg = BundleUtils.getStringValue(PROPERTIES_FILE_VOMSG, code + "");
        } catch (Exception e) {
            logger.error("构建结果码消息失败!", e);
        }
        return msg;
    }

    public static ResponseEntity validateFailed(List<ObjectError> errors){
        StringBuilder sb = new StringBuilder();
        for(ObjectError error : errors){
            sb.append(error.getDefaultMessage()).append("    ");
        }
        System.out.println(sb.toString());
        return new ResponseEntity(0,sb.toString());
    }

}
