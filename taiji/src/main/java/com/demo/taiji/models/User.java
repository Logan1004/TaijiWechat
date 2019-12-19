package com.demo.taiji.models;

import java.io.Serializable;

public class User implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column User.userid
     *
     * @mbg.generated
     */
    private Integer userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column User.username
     *
     * @mbg.generated
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column User.wechatid
     *
     * @mbg.generated
     */
    private String wechatid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column User.phone
     *
     * @mbg.generated
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table User
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column User.userid
     *
     * @return the value of User.userid
     *
     * @mbg.generated
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column User.userid
     *
     * @param userid the value for User.userid
     *
     * @mbg.generated
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column User.username
     *
     * @return the value of User.username
     *
     * @mbg.generated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column User.username
     *
     * @param username the value for User.username
     *
     * @mbg.generated
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column User.wechatid
     *
     * @return the value of User.wechatid
     *
     * @mbg.generated
     */
    public String getWechatid() {
        return wechatid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column User.wechatid
     *
     * @param wechatid the value for User.wechatid
     *
     * @mbg.generated
     */
    public void setWechatid(String wechatid) {
        this.wechatid = wechatid == null ? null : wechatid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column User.phone
     *
     * @return the value of User.phone
     *
     * @mbg.generated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column User.phone
     *
     * @param phone the value for User.phone
     *
     * @mbg.generated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table User
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userid=").append(userid);
        sb.append(", username=").append(username);
        sb.append(", wechatid=").append(wechatid);
        sb.append(", phone=").append(phone);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}