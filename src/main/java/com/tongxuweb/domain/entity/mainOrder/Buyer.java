package com.tongxuweb.domain.entity.mainOrder;

import java.io.Serializable;

/**
 */
public class Buyer implements Serializable{

    private String guestUser;
    private String id;
    private String memberUrl;
    private String nick;
    private String phoneNum;

    public String getGuestUser() {
        return guestUser;
    }

    public void setGuestUser(String guestUser) {
        this.guestUser = guestUser;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMemberUrl() {
        return memberUrl;
    }

    public void setMemberUrl(String memberUrl) {
        this.memberUrl = memberUrl;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
