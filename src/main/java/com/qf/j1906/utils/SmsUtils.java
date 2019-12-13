package com.qf.j1906.utils;


import com.google.gson.Gson;
import com.zhenzi.sms.ZhenziSmsClient;
import lombok.Data;

import java.util.Random;

/**
 * @author 惠佳旭
 * @date 2019/12/5
 */
public class SmsUtils {

    private static final String API_URL = "https://sms_developer.zhenzikj.com";
    private static final String APP_ID = "103669";
    private static final String APP_SECRET = "ca6ab914-11b2-435f-a4fd-b3d9ea15ada6";

    public static String sendSms(String phone) {
        ZhenziSmsClient smsClient = new ZhenziSmsClient(API_URL, APP_ID, APP_SECRET);
        // 生成6位验证码
        String verifyCode = String.valueOf(new Random().nextInt(899999) + 100000);
        // 发送短信
        try {
            String send = smsClient.send(phone, "您的验证码为:" + verifyCode + "，该码有效期为5分钟，该码只能使用一次!");
            SmsResult smsResult = new Gson().fromJson(send, SmsResult.class);
            if (smsResult.getCode() == 0) {
                return verifyCode;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

@Data
class SmsResult {
    private int code;
    private String data;
}
