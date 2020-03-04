package org.r.base.sms.config;

import lombok.Data;

/**
 * @author casper
 * @date 20-3-4 下午2:04
 **/
@Data
public class SmsConfig {


    /**
     * access key
     */
    private String ack;

    /**
     * access security
     */
    private String acs;

    /**
     * 区域
     */
    private String region;





}
