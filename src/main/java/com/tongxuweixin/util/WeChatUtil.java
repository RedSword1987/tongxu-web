package com.tongxuweixin.util;

import com.tongxuweixin.menu.WeixinConfig;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.UUID;

public class WeChatUtil {

    //临时缓存
    public static Hashtable<String, Object> Token = new Hashtable<String, Object>();
    public static Hashtable<String, Object> JSAPI = new Hashtable<String, Object>();

    private static final String JSAPI_TICKET_URL = "https://api.weixin.qq.com/cgi-bin/ticket/getticket?type=jsapi";

    public static String getTicket() {
        String jsAPITick = null;
        if (JSAPI.get("ticket") != null && (Long.valueOf(String.valueOf(JSAPI.get("expires_time"))) > (System.currentTimeMillis() / 1000))) {
            jsAPITick = String.valueOf(JSAPI.get("ticket"));
        } else {
            AccessToken token = WeChatUtil.getAccessToken(WeixinConfig.weixin_corpId_, WeixinConfig.weixin_secret_);
            String jsAPITicktUrl = JSAPI_TICKET_URL + "&access_token=" + token.getToken();
            try {
                JSONObject jsonObject = HttpUtil.httpsRequest(jsAPITicktUrl, "GET", null);
                jsAPITick = jsonObject.getString("ticket");
                System.out.println(jsAPITick);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return jsAPITick;

    }

    /**
     * 获取access_token
     *
     * @param appid     凭证
     * @param appsecret 密钥
     * @return
     */
    public static AccessToken getAccessToken(String appid, String appsecret) {
        //TODO  1.token得存到数据库，或者其他缓存里去  2.得加个参数，强行刷新

        // 获取access_token的接口地址（GET） 限200（次/天）
        String access_token_url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET";
        AccessToken accessToken = null;

        if (Token.get("access_token") != null && (Long.valueOf(String.valueOf(Token.get("expires_time"))) > (System.currentTimeMillis() / 1000))) {
            accessToken = new AccessToken();
            accessToken.setToken(String.valueOf(Token.get("access_token")));
            accessToken.setExpiresIn(Integer.valueOf(String.valueOf(Token.get("expires_in"))));
        } else {

            String requestUrl = access_token_url.replace("APPID", appid).replace("APPSECRET", appsecret);
            JSONObject jsonObject = HttpUtil.httpRequest(requestUrl, "GET", null);
            // 如果请求成功
            if (null != jsonObject) {
                accessToken = new AccessToken();
                accessToken.setToken(jsonObject.getString("access_token"));
                accessToken.setExpiresIn(jsonObject.getInt("expires_in"));
                accessToken.setCreateTime(System.currentTimeMillis() / 1000);
                {
                    Token.put("expires_in", jsonObject.getString("access_token"));
                    Token.put("expires_in", jsonObject.getInt("expires_in"));
                    Token.put("expires_time", System.currentTimeMillis() / 1000 + jsonObject.getInt("expires_in"));

                }
            }
        }
        return accessToken;
    }

    /**
     * 创建菜单
     *
     * @param menu        菜单实例
     * @param accessToken 有效的access_token
     * @return 0表示成功，其他值表示失败
     */
    public static int createMenu(Menu menu, String accessToken) {
        // 菜单创建（POST） 限100（次/天）
        String menu_create_url = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=ACCESS_TOKEN";
        int result = 0;
        // 拼装创建菜单的url
        String url = menu_create_url.replace("ACCESS_TOKEN", accessToken);
        // 将菜单对象转换成json字符串
        String jsonMenu = JSONObject.fromObject(menu).toString();
        // 调用接口创建菜单
        JSONObject jsonObject = HttpUtil.httpRequest(url, "POST", jsonMenu);
        if (null != jsonObject) {
            if (0 != jsonObject.getInt("errcode")) {
                result = jsonObject.getInt("errcode");
            }
        }
        return result;
    }

    public static void createConditionalMenu(Menu menu, String accessToken) {
        // 菜单创建（POST） 限100（次/天）
        String menu_create_url = "https://api.weixin.qq.com/cgi-bin/menu/addconditional?access_token=ACCESS_TOKEN";
        // 拼装创建菜单的url
        String url = menu_create_url.replace("ACCESS_TOKEN", accessToken);
        // 将菜单对象转换成json字符串
        String jsonMenu = JSONObject.fromObject(menu).toString();

        System.out.println(jsonMenu);
        // 调用接口创建菜单
        JSONObject jsonObject = HttpUtil.httpRequest(url, "POST", jsonMenu);
        System.out.println(JSONObject.fromObject(jsonObject).toString());

    }

    public static void deleteMenu(String accessToken) {
        String menu_delete_url = "https://api.weixin.qq.com/cgi-bin/menu/delete?access_token=ACCESS_TOKEN";
        String url = menu_delete_url.replace("ACCESS_TOKEN", accessToken);
        HttpUtil.httpRequest(url, "GET", null);
    }

    public static void getMenus(String accessToken) {
        String menu_delete_url = "https://api.weixin.qq.com/cgi-bin/menu/get?access_token=ACCESS_TOKEN";
        String url = menu_delete_url.replace("ACCESS_TOKEN", accessToken);
        JSONObject jsonObject = HttpUtil.httpRequest(url, "GET", null);
        System.out.println(JSONObject.fromObject(jsonObject).toString());
    }

    public static void createGroup(Group group, String accessToken) {
        String group_create_url = "https://api.weixin.qq.com/cgi-bin/groups/create?access_token=ACCESS_TOKEN";
        // 拼装创建菜单的url
        String url = group_create_url.replace("ACCESS_TOKEN", accessToken);
        Map map = new HashMap();
        map.put("group", group);
        // 将菜单对象转换成json字符串
        String jsonMenu = JSONObject.fromObject(map).toString();
        JSONObject jsonObject = HttpUtil.httpRequest(url, "POST", jsonMenu);
        int groupId = jsonObject.getJSONObject("group").getInt("id");
    }

    public static void getGroup(String accessToken) {
        String group_get_url = "https://api.weixin.qq.com/cgi-bin/groups/get?access_token=ACCESS_TOKEN";
        // 拼装创建菜单的url
        String url = group_get_url.replace("ACCESS_TOKEN", accessToken);

        JSONObject jsonObject = HttpUtil.httpRequest(url, "GET", null);
        JSONArray jsonArray = jsonObject.getJSONArray("groups");

        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject jo = (JSONObject) jsonArray.get(i);
            System.out.println(jo.getInt("id"));
            System.out.println(jo.getString("name"));
            System.out.println(jo.getInt("count"));
        }

    }

    public static void updateMemberGroup(String accessToken, String openid, String to_groupid) {
        String group_get_url = "https://api.weixin.qq.com/cgi-bin/groups/members/update?access_token=ACCESS_TOKEN";
        // 拼装创建菜单的url
        String url = group_get_url.replace("ACCESS_TOKEN", accessToken);

        Map map = new HashMap();
        map.put("openid", openid);
        map.put("to_groupid", to_groupid);
        // 将菜单对象转换成json字符串
        String jsonMenu = JSONObject.fromObject(map).toString();

        JSONObject jsonObject = HttpUtil.httpRequest(url, "POST", jsonMenu);
    }

    private String createNonceStr() {
        return UUID.randomUUID().toString();
    }

    private String createTimestamp() {
        return Long.toString(System.currentTimeMillis() / 1000);
    }

    /**
     * 组装菜单数据
     *
     * @return
     */
    public static Menu getDefaultMenu() {

        ViewButton btn11 = new ViewButton();
        btn11.setName("企业注册");
        btn11.setType("view");
        btn11.setUrl(UrlCodeUtil.GetCode("https://wespark.cdpcloud.com/wx/oauth?controllerName=register_phone&module=register"));

        ViewButton btn12 = new ViewButton();
        btn12.setName("绑定帐号");
        btn12.setType("view");
        btn12.setUrl(UrlCodeUtil.GetCode("https://wespark.cdpcloud.com/wx/oauth?action=binding"));

        ViewButton btn31 = new ViewButton();
        btn31.setName("访问CDP");
        btn31.setType("view");
        btn31.setUrl("http://www.cdpgroupltd.com/");

        ViewButton btn32 = new ViewButton();
        btn32.setName("APP下载");
        btn32.setType("view");
        btn32.setUrl("https://wespark.cdpcloud.com/download/app.html");

        ViewButton btn33 = new ViewButton();
        btn33.setName("关于WeSpark");
        btn33.setType("view");
        btn33.setUrl(UrlCodeUtil.GetCode("https://wespark.cdpcloud.com/wx/oauth?controllerName=HelpAbout"));

        ComplexButton mainBtn1 = new ComplexButton();
        mainBtn1.setName("新用户");
        mainBtn1.setSub_button(new WeChatButton[]{btn11, btn12});

        ViewButton mainBtn2 = new ViewButton();
        mainBtn2.setName("立即体验");
        mainBtn2.setType("view");
        mainBtn2.setUrl(UrlCodeUtil.GetCode("https://wespark.cdpcloud.com/wx/oauth?controllerName=myProfile&last_status=1&isDemo=1"));

        ComplexButton mainBtn3 = new ComplexButton();
        mainBtn3.setName("更多");
        mainBtn3.setSub_button(new WeChatButton[]{btn31, btn32, btn33});

        Menu menu = new Menu();
        menu.setButton(new WeChatButton[]{mainBtn1, mainBtn2, mainBtn3});

        return menu;
    }

    public static Menu getHRMenu() {

        ViewButton btn10 = new ViewButton();
        btn10.setName("企业注册");
        btn10.setType("view");
        btn10.setUrl(UrlCodeUtil.GetCode("https://wespark.cdpcloud.com/wx/oauth?controllerName=register_phone&module=register"));

        ViewButton btn11 = new ViewButton();
        btn11.setName("我的公司");
        btn11.setType("view");
        btn11.setUrl(UrlCodeUtil.GetCode("https://wespark.cdpcloud.com/wx/oauth?controllerName=myCompany"));

        ViewButton btn12 = new ViewButton();
        btn12.setName("我的服务");
        btn12.setType("view");
        btn12.setUrl(UrlCodeUtil.GetCode("https://wespark.cdpcloud.com/wx/oauth?controllerName=hr_service&module=hr_service"));

        ViewButton btn13 = new ViewButton();
        btn13.setName("我的员工");
        btn13.setType("view");
        btn13.setUrl(UrlCodeUtil.GetCode("https://wespark.cdpcloud.com/wx/oauth?controllerName=eeList&module=hr_ee"));

        ViewButton btn21 = new ViewButton();
        btn21.setName("安心社保");
        btn21.setType("view");
        btn21.setUrl(UrlCodeUtil.GetCode("https://wespark.cdpcloud.com/wx/oauth?controllerName=securityStatic&module=hr_security"));

        ViewButton btn22 = new ViewButton();
        btn22.setName("惠发薪");
        btn22.setType("view");
        btn22.setUrl(UrlCodeUtil.GetCode("https://wespark.cdpcloud.com/wx/oauth?controllerName=salaryStatic&module=hr_salary"));

        ViewButton btn23 = new ViewButton();
        btn23.setName("月度服务报告");
        btn23.setType("view");
        btn23.setUrl(UrlCodeUtil.GetCode("https://wespark.cdpcloud.com/wx/oauth?controllerName=myReport"));

        ViewButton btn24 = new ViewButton();
        btn24.setName("商业保险");
        btn24.setType("view");
        btn24.setUrl(UrlCodeUtil.GetCode("https://wespark.cdpcloud.com/wx/oauth?controllerName=HrInsurance"));


        ViewButton btn31 = new ViewButton();
        btn31.setName("解绑帐号");
        btn31.setType("view");
        btn31.setUrl(UrlCodeUtil.GetCode("https://wespark.cdpcloud.com/wx/oauth?action=binding"));

        ViewButton btn32 = new ViewButton();
        btn32.setName("访问CDP");
        btn32.setType("view");
        btn32.setUrl("http://www.cdpgroupltd.com/");

        ViewButton btn33 = new ViewButton();
        btn33.setName("APP下载");
        btn33.setType("view");
        btn33.setUrl("https://wespark.cdpcloud.com/download/app.html");

        ViewButton btn34 = new ViewButton();
        btn34.setName("关于WeSpark");
        btn34.setType("view");
        btn34.setUrl(UrlCodeUtil.GetCode("https://wespark.cdpcloud.com/wx/oauth?controllerName=HelpAbout"));


        ViewButton btn35 = new ViewButton();
        btn35.setName("重置密码");
        btn35.setType("view");
        btn35.setUrl(UrlCodeUtil.GetCode("https://wespark.cdpcloud.com/wx/oauth?controllerName=changePwd"));


        ComplexButton mainBtn1 = new ComplexButton();
        mainBtn1.setName("公司管理");
        mainBtn1.setSub_button(new WeChatButton[]{btn10, btn11, btn12, btn13});

        ComplexButton mainBtn2 = new ComplexButton();
        mainBtn2.setName("CDP服务");
        mainBtn2.setSub_button(new WeChatButton[]{btn21, btn22, btn23, btn24});

        ComplexButton mainBtn3 = new ComplexButton();
        mainBtn3.setName("更多");
        mainBtn3.setSub_button(new WeChatButton[]{btn31, btn32, btn33, btn34, btn35});

        Menu menu = new Menu();
        menu.setButton(new WeChatButton[]{mainBtn1, mainBtn2, mainBtn3});
        Matchrule matchrule = new Matchrule();
        matchrule.setGroup_id("102");
        menu.setMatchrule(matchrule);
        return menu;
    }

    public static Menu getESSMenu() {
        ViewButton btn11 = new ViewButton();
        btn11.setName("我的工资单");
        btn11.setType("view");
        btn11.setUrl(UrlCodeUtil.GetCode("https://wespark.cdpcloud.com/wx/oauth?controllerName=mySalary"));

        ViewButton btn21 = new ViewButton();
        btn21.setName("我的人事档案");
        btn21.setType("view");
        btn21.setUrl(UrlCodeUtil.GetCode("https://wespark.cdpcloud.com/wx/oauth?controllerName=personInfo&module=ee_person"));
        ViewButton btn22 = new ViewButton();
        btn22.setName("我的商业保险");
        btn22.setType("view");
        btn22.setUrl(UrlCodeUtil.GetCode("https://wespark.cdpcloud.com/wx/oauth?controllerName=myInsurance"));

        ViewButton btn23 = new ViewButton();
        btn23.setName("通讯录");
        btn23.setType("view");
        btn23.setUrl(UrlCodeUtil.GetCode("https://wespark.cdpcloud.com/wx/oauth?controllerName=contactList&module=myContact"));

        ViewButton btn31 = new ViewButton();
        btn31.setName("解绑帐号");
        btn31.setType("view");
        btn31.setUrl(UrlCodeUtil.GetCode("https://wespark.cdpcloud.com/wx/oauth?action=binding"));

        ViewButton btn32 = new ViewButton();
        btn32.setName("企业注册");
        btn32.setType("view");
        btn32.setUrl(UrlCodeUtil.GetCode("https://wespark.cdpcloud.com/wx/oauth?controllerName=register_phone&module=register"));

        ViewButton btn33 = new ViewButton();
        btn33.setName("APP下载");
        btn33.setType("view");
        btn33.setUrl("https://wespark.cdpcloud.com/download/app.html");

        ViewButton btn34 = new ViewButton();
        btn34.setName("关于WeSpark");
        btn34.setType("view");
        btn34.setUrl(UrlCodeUtil.GetCode("https://wespark.cdpcloud.com/wx/oauth?controllerName=HelpAbout"));

        ViewButton btn35 = new ViewButton();
        btn35.setName("重置密码");
        btn35.setType("view");
        btn35.setUrl(UrlCodeUtil.GetCode("https://wespark.cdpcloud.com/wx/oauth?controllerName=changePwd"));


        ComplexButton mainBtn2 = new ComplexButton();
        mainBtn2.setName("查询服务");
        mainBtn2.setSub_button(new WeChatButton[]{btn21, btn22, btn23});

        ComplexButton mainBtn3 = new ComplexButton();
        mainBtn3.setName("更多");
        mainBtn3.setSub_button(new WeChatButton[]{btn31, btn32, btn33, btn34, btn35});

        Menu menu = new Menu();
        menu.setButton(new WeChatButton[]{btn11, mainBtn2, mainBtn3});
        Matchrule matchrule = new Matchrule();
        matchrule.setGroup_id("103");
        menu.setMatchrule(matchrule);
        return menu;
    }

    public static Menu getHrESSMenu() {

        ViewButton btn10 = new ViewButton();
        btn10.setName("企业注册");
        btn10.setType("view");
        btn10.setUrl(UrlCodeUtil.GetCode("https://wespark.cdpcloud.com/wx/oauth?controllerName=register_phone&module=register"));

        ViewButton btn11 = new ViewButton();
        btn11.setName("我的公司");
        btn11.setType("view");
        btn11.setUrl(UrlCodeUtil.GetCode("https://wespark.cdpcloud.com/wx/oauth?controllerName=myCompany"));

        ViewButton btn12 = new ViewButton();
        btn12.setName("我的服务");
        btn12.setType("view");
        btn12.setUrl(UrlCodeUtil.GetCode("https://wespark.cdpcloud.com/wx/oauth?controllerName=hr_service&module=hr_service"));

        ViewButton btn13 = new ViewButton();
        btn13.setName("我的员工");
        btn13.setType("view");
        btn13.setUrl(UrlCodeUtil.GetCode("https://wespark.cdpcloud.com/wx/oauth?controllerName=eeList&module=hr_ee"));

        ViewButton btn14 = new ViewButton();
        btn14.setName("个人中心");
        btn14.setType("view");
        btn14.setUrl(UrlCodeUtil.GetCode("https://wespark.cdpcloud.com/wx/oauth?controllerName=myProfile&last_status=2&isDemo=0"));

        ViewButton btn21 = new ViewButton();
        btn21.setName("安心社保");
        btn21.setType("view");
        btn21.setUrl(UrlCodeUtil.GetCode("https://wespark.cdpcloud.com/wx/oauth?controllerName=securityStatic&module=hr_security"));

        ViewButton btn22 = new ViewButton();
        btn22.setName("惠发薪");
        btn22.setType("view");
        btn22.setUrl(UrlCodeUtil.GetCode("https://wespark.cdpcloud.com/wx/oauth?controllerName=salaryStatic&module=hr_salary"));

        ViewButton btn23 = new ViewButton();
        btn23.setName("月度服务报告");
        btn23.setType("view");
        btn23.setUrl(UrlCodeUtil.GetCode("https://wespark.cdpcloud.com/wx/oauth?controllerName=myReport"));

        ViewButton btn24 = new ViewButton();
        btn24.setName("商业保险");
        btn24.setType("view");
        btn24.setUrl(UrlCodeUtil.GetCode("https://wespark.cdpcloud.com/wx/oauth?controllerName=HrInsurance"));

        ViewButton btn31 = new ViewButton();
        btn31.setName("解绑帐号");
        btn31.setType("view");
        btn31.setUrl(UrlCodeUtil.GetCode("https://wespark.cdpcloud.com/wx/oauth?action=binding"));

        ViewButton btn32 = new ViewButton();
        btn32.setName("访问CDP");
        btn32.setType("view");
        btn32.setUrl("http://www.cdpgroupltd.com/");

        ViewButton btn33 = new ViewButton();
        btn33.setName("APP下载");
        btn33.setType("view");
        btn33.setUrl("https://wespark.cdpcloud.com/download/app.html");

        ViewButton btn34 = new ViewButton();
        btn34.setName("关于WeSpark");
        btn34.setType("view");
        btn34.setUrl(UrlCodeUtil.GetCode("https://wespark.cdpcloud.com/wx/oauth?controllerName=HelpAbout"));

        ViewButton btn35 = new ViewButton();
        btn35.setName("重置密码");
        btn35.setType("view");
        btn35.setUrl(UrlCodeUtil.GetCode("https://wespark.cdpcloud.com/wx/oauth?controllerName=changePwd"));

        ComplexButton mainBtn1 = new ComplexButton();
        mainBtn1.setName("公司管理");
        mainBtn1.setSub_button(new WeChatButton[]{btn10, btn11, btn12, btn13, btn14});

        ComplexButton mainBtn2 = new ComplexButton();
        mainBtn2.setName("CDP服务");
        mainBtn2.setSub_button(new WeChatButton[]{btn21, btn22, btn23, btn24});

        ComplexButton mainBtn3 = new ComplexButton();
        mainBtn3.setName("更多");
        mainBtn3.setSub_button(new WeChatButton[]{btn31, btn32, btn33, btn34, btn35});

        Menu menu = new Menu();
        menu.setButton(new WeChatButton[]{mainBtn1, mainBtn2, mainBtn3});
        Matchrule matchrule = new Matchrule();
        matchrule.setGroup_id("104");
        menu.setMatchrule(matchrule);
        return menu;
    }

    public static void main(String[] args) {
        boolean isCreateGroup = true;
        AccessToken at = WeChatUtil.getAccessToken(WeixinConfig.weixin_corpId_, WeixinConfig.weixin_secret_);
        System.out.println(at.getToken());
        if (null != at && isCreateGroup) {

            Group group = new Group();
            group.setName("GUEST");
            WeChatUtil.createGroup(group, at.getToken());
            group.setName("LOGINED");
            WeChatUtil.createGroup(group, at.getToken());

        }

        if (null != at) {
            // 调用接口创建菜单
            //WeChatUtil.deleteMenu(at.getToken());

            // WeChatUtil.createMenu(WeChatUtil.getDefaultMenu(), at.getToken());


            //WeChatUtil.getGroup(at.getToken());

            //WeChatUtil.createConditionalMenu(getHRMenu(), at.getToken());
            //WeChatUtil.createConditionalMenu(getESSMenu(), at.getToken());
            //WeChatUtil.createConditionalMenu(getHrESSMenu(), at.getToken());
            //WeChatUtil.getMenus(at.getToken());

            //WeChatUtil.updateMemberGroup(at.getToken(), "orbWTsxiEWQXgM8hR9nRL93QWuZw", "102");

            //String ticket = WeChatUtil.getTicket(at.getToken());
            //System.out.println(ticket);

        }
    }
}
