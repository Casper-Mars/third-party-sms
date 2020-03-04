package org.r.base.sms.service;

/**
 * @author casper
 * @date 20-3-4 下午2:14
 **/
public interface SmsService {


    /**
     * 发送验证码
     *
     * @param phone        手机号
     * @param templateCode 模板号
     * @param sign         签名
     */
    void sendSmsCode(String phone, String templateCode, String sign);


}
