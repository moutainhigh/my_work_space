package com.ooteco.common;

import com.google.gson.Gson;

import java.math.BigDecimal;

/**
 * Created by yan on 2016/11/5.
 */
public class Cons {
    /**
     * SESSION用户的KEY
     */
    public final static String SESSION_USER = "SESSION_USER";
    public final static String SESSION_OPENID = "SESSION_OPENID";
    public final static String SESSION_WECHAT_USER = "SESSION_USER";

    public final static Gson gson = new Gson();
    /**
     * 支付请求URL
     */
    public final static String PATH_PAY = "PATH_PAY";

    /**
     * 付款请求url
     */
    public final static String PATH_TRANSFER = "PATH_TRANSFER";

    /**
     * 项目名称
     */
    public final static String CID = "CID";

    /**
     * 充值名称
     */
    public final static String RECHARGETITLE = "RECHAREGE_TILTE";

    /**
     * 支付密钥
     */
    public final static String PAY_SIGN = "PAY_SIGN";

    /**
     * 单用户限额（按日）
     */
    public final static String USER_LIMIT = "USER_LIMIT";

    /**
     * vip单用户限额（按日）
     */
    public final static String USER_VIP_LIMIT = "USER_VIP_LIMIT";


    /**
     * 按产品限额（按日）
     */
    public final static String PRODUCT_LIMIT = "PRODUCT_LIMIT";


    /**
     * 所有产品限额（按日）
     */
    public final static String TOTAL_PRODUCT_LIMIT = "TOTAL_PRODUCT_LIMIT";

    /**
     * 定时结算
     */
    public final static String SETTLEMENT = "SETTLEMENT";

    /**
     * 定时结算
     */
    public final static String AM_SETTLEMENT_TIME = "AM_SETTLEMENT_TIME";

    /**
     * 预测结果
     */
    public final static int SUCCESS = 1;
    public final static int FAIL = -1;


    /**
     * 公众号开发平台ID
     */
    public final static String MPID = "MPID";

    /**
     * 微信号授权类型
     */
    public final static String WECHAT_AUTH_TYPE = "WECHAT_AUTH_TYPE";

    /**
     * APP支付编号
     */
    public final static String APPPAYCID = "APPPAYCID";
    /**
     * 支付CID
     */
    public final static String PAYCID = "PAYCID";
    /**
     * 每日提现限次
     */
    public final static String TRANSFER_COUNT = "TRANSFER_COUNT";

    /**
     * APP支付请求路径
     */
    public final static String PATH_APP_PAY = "PATH_APP_PAY";

    /**
     * 周末计算方式
     */
    public final static String WEEKEND = "WEEKEND";

    public final static String MODEL = "MODEL";

    public final static String WECHAT_AUTH_TYPE_SNSAPI_USERINFO = "snsapi_userinfo";
    public final static String WECHAT_AUTH_TYPE_SNSAPI_BASE = "snsapi_base";

    /**
     * biz层如果有error返回  则用这个作为key存到map
     */
    public final static String ERROR_KEY = "ERROR_KEY";

    public final static String MAP_MSG_KEY = "msg";

    /**
     * 所有渠道的顶级
     */
    public final static String TOP_CHANNEL_NO = "000001";

    /**
     * 设置提成比例时 默认的区间上限
     */
    public final static BigDecimal DEFAULT_MAX_BONUS_INTERVAL = BigDecimal.valueOf(9999999999l);

    public final static String SEPARATOR="/"; // File.separator

}
