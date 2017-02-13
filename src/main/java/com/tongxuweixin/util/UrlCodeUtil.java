package com.tongxuweixin.util;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class UrlCodeUtil {
    public static SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmssSSS");

    public static String urlEncodeUTF8(String source) {
        String result = source;
        try {
            result = java.net.URLEncoder.encode(source, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static String GetCode(String url) {
        String GET_CODE = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=APPID&redirect_uri=REDIRECT_URI&response_type=code&scope=snsapi_base&state=STATE#wechat_redirect";
        //String GET_CODE = "https://open.weixin.qq.com/connect/qrconnect?appid=APPID&redirect_uri=REDIRECT_URI&response_type=code&scope=snsapi_login&state=1#wechat_redirect";
        String get_code_url = "";
        //		get_code_url = GET_CODE.replace("APPID", "wxb2e38cb89464586b").replace("REDIRECT_URI",
        //				urlEncodeUTF8("http://www.authcloud.net/wx/WXOAuthServlet?controllerName=account_bind&module=weixin_index"));
//		get_code_url = GET_CODE.replace("APPID", WeixinConfig.corpId_test_).replace("REDIRECT_URI", urlEncodeUTF8(url));

        //https://open.weixin.qq.com/connect/oauth2/authorize?appid=wxb2e38cb89464586b&redirect_uri=http%3A%2F%2Fwww.authcloud.net%2Fwx%2FWXOAuthServlet%3Faction%3Dbinding&response_type=code&scope=snsapi_base&state=STATE#wechat_redirect
        return get_code_url;
    }

    /**
     * 获取随机码
     *
     * @return
     */
    public static String getRandomCode() {
        Calendar c1 = Calendar.getInstance();
        c1.setTime(new Date());
        Random random1 = new Random();
        String result = String.valueOf(Math.abs(random1.nextInt(100000000))) + "_" + format.format(c1.getTime());
        return result;
    }

    public static void main(String[] args) {
        //		https://wespark.cdpcloud.com/wx
        System.out.println(GetCode("https://wespark.cdpcloud.com/wx/oauth?controllerName=register_phone&module=register"));
        System.out.println(GetCode("https://wespark.cdpcloud.com/wx/oauth?controllerName=myCompany"));
        System.out.println(GetCode("https://wespark.cdpcloud.com/wx/oauth?controllerName=eeList&module=hr_ee"));
        System.out.println(GetCode("https://wespark.cdpcloud.com/wx/oauth?controllerName=HelpAbout"));
    }
}
