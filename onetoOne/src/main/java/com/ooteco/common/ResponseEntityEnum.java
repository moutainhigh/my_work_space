package com.ooteco.common;

/**
 * Created by yan on 2016/11/4.
 */
public enum ResponseEntityEnum {
    ERROR(500, "服务开小差"),
    FAIL(-1, "操作出错"),
    PARAM_ERROR(-2, "参数有误"),
    //changbo
    PRODUCT_NULL(1000, "没有有效的产品"),
    CLOSEPRICE_NULL(1100, "该天的产品还未收盘"),
    BALANCE_NOT_ENOUGH(1200, "余额不足"),
    WITHDRAW_FAIL(1201, "提现失败"),
    WITHDRAW_URL_FAIL(1202, "提现url	访问失败"),


    //yanwei
    LOGIN_TIMEOUT(1500, "登录超时"),
    NEED_PAY(1501, "正在发起微信支付"),
    NEED_PAY_FAIL(1502, "产品余额不足,支付发起失败"),
    ORDER_SAVE_FAIL(1503, "订单保存失败"),
    TRADE_SAVE_FAIL(1504, "交易保存失败"),
    USERBALANCE_UPDATE_FAIL(1505, "用户余额更新失败"),
    SQL_ERROR(1506, "数据库操作异常"),
    PRODUCT_UNVALID(1057, "标的已下架"),
    TYPE_UNVALID(1058, "产品分类已下架"),
    GOODS_UNVALID(1059, "产品暂时下架中"),
    GOODS_UNVALIDDATE(1060, "产品暂时下架中,请稍后再来"),
    PRODUCT_NOTINSALETIME(1061, "产品不在购买时间,请返回重新选择购买"),
    PRODUCT_SALETIMEERROR(1062, "产品可售时间不正确"),
    DICTIONNARY_EMPTY(1061, "字典数据为空"),
    PRODUCTFORSINGLEUSERLIMIT(1062, "今日认购额度超限，请联系客服"),
    PRODUCTLIMIT(1063, "此产品认购金额已起出限制"),
    PRODUCTFORALLLIMIT(1061, "您认购的金额已超出今日可售金额"),
    USER_LOGIN_ERROR(1062, "登录失败,管理员不存在"),
    USER_LOGIN_ERROR_PASS_ERROR(1063, "登录失败,密码不正确"),
    PAYMENT_SAVE_FAIL(1064, "支付信息保存失败"),
    DATEFORMATE_ERROR(1065, "日期格式不正确"),
    DATE_EXIST_ERROR(1066, "假期已存在"),
    NOTIFY_SIGN_ERROR(1067, "签名验证失败"),
    EXCEL_EMPTY(1067, "表格中无数据"),
    ORDER_EMPTY(1068, "无此订单"),
    ORDER_NOPAY(1069, "此订单未支付"),
    USER_SETTING_SAVE_ERROR(1070, "更新失败"),
    RACHRAEGE_TOO_LOW(1071, "您最少需充值10元"),
    NO_UPDATE_ANY_SETTING(1072, "您未更新任何设置"),
    CONTENT_TOO_LONG(1073, "发言不有超过140个字哦!"),
    COMMENT_HAS_LIKE(1074, "已点过赞哦"),
    COMMENT_NOT_EXIST(1075, "发言丢了,无法点评哦"),
    HAS_FOLLOW_BUY_THIS_USER(1076, "已经跟买了此位牛人哦"),
    FOLLOW_BUY_FAIL(1077, "不明原因,跟买失败"),
    NO_SUBSCRIBE(1078, "未关注"),
    REDPACK_NOHAS(1079, "您还没有获取此红包,请返回重新选择"),
    REDPACK_HAS_USE(1080, "红包已使用过,请返回重新选择"),
    REDPACK_NOT_IN_USE_TIME(1081, "红包不在使用日期"),
    ICODE_ERROR(1082, "邀请码不正确"),
    ICODE_NOT_EXIST(1083, "邀请码不存在"),
    ICODE_CAN_NOT_SUBSCRIBE_SELF(1084, "不能绑定自己的邀请码哦"),
    ICODE_HAS_BIND(1085, "已绑定邀请人"),
    HAS_UNSUBSCRIBE(1086, "已取消关注"),
    //z
    USER_REDPACK_NULL(2001, "您还没有可领取的红包"),
    GET_REFPACK_EXCEPTION(2002, "领取红包异常"),
    REDPACK_GET_FAIL(2004, "领取红包失败"),
	REDPACK_NULL(2005,"您还没有红包"),
    NEED_RECHARGE(2006,"余额不足,请先充值!"),


    ARTICLE_NOT_EXITS(3001,"文章不存在"),

    ;

    private Integer code;
    private String msg;
    private ResponseEntityEnum(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString(){
        return this.getMsg();
    }
}
