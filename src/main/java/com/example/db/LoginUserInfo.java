package com.example.db;

import java.io.Serializable;
import javax.annotation.Generated;

public class LoginUserInfo implements Serializable {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String userId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String pw;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private static final long serialVersionUID = 1L;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public LoginUserInfo(String userId, String pw) {
        this.userId = userId;
        this.pw = pw;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public LoginUserInfo() {
        super();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getUserId() {
        return userId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public LoginUserInfo withUserId(String userId) {
        this.setUserId(userId);
        return this;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPw() {
        return pw;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public LoginUserInfo withPw(String pw) {
        this.setPw(pw);
        return this;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPw(String pw) {
        this.pw = pw == null ? null : pw.trim();
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        LoginUserInfo other = (LoginUserInfo) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getPw() == null ? other.getPw() == null : this.getPw().equals(other.getPw()));
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getPw() == null) ? 0 : getPw().hashCode());
        return result;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", pw=").append(pw);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}