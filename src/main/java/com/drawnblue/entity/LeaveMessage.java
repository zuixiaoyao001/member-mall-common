package com.drawnblue.entity;

import java.util.Date;

public class LeaveMessage {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column leave_message.id
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column leave_message.createdBy
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private String createdby;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column leave_message.messageCode
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private String messagecode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column leave_message.messageTitle
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private String messagetitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column leave_message.state
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private Integer state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column leave_message.createTime
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private Date createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column leave_message.messageContent
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private String messagecontent;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column leave_message.id
     *
     * @return the value of leave_message.id
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column leave_message.id
     *
     * @param id the value for leave_message.id
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column leave_message.createdBy
     *
     * @return the value of leave_message.createdBy
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public String getCreatedby() {
        return createdby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column leave_message.createdBy
     *
     * @param createdby the value for leave_message.createdBy
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setCreatedby(String createdby) {
        this.createdby = createdby == null ? null : createdby.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column leave_message.messageCode
     *
     * @return the value of leave_message.messageCode
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public String getMessagecode() {
        return messagecode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column leave_message.messageCode
     *
     * @param messagecode the value for leave_message.messageCode
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setMessagecode(String messagecode) {
        this.messagecode = messagecode == null ? null : messagecode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column leave_message.messageTitle
     *
     * @return the value of leave_message.messageTitle
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public String getMessagetitle() {
        return messagetitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column leave_message.messageTitle
     *
     * @param messagetitle the value for leave_message.messageTitle
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setMessagetitle(String messagetitle) {
        this.messagetitle = messagetitle == null ? null : messagetitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column leave_message.state
     *
     * @return the value of leave_message.state
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column leave_message.state
     *
     * @param state the value for leave_message.state
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column leave_message.createTime
     *
     * @return the value of leave_message.createTime
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column leave_message.createTime
     *
     * @param createtime the value for leave_message.createTime
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column leave_message.messageContent
     *
     * @return the value of leave_message.messageContent
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public String getMessagecontent() {
        return messagecontent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column leave_message.messageContent
     *
     * @param messagecontent the value for leave_message.messageContent
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setMessagecontent(String messagecontent) {
        this.messagecontent = messagecontent == null ? null : messagecontent.trim();
    }
}