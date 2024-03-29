package com.drawnblue.entity;

import java.math.BigDecimal;
import java.util.Date;

public class UserRecharge {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_recharge.RECHARGE_ID
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private String rechargeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_recharge.RECHARGE_TIME
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private Date rechargeTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_recharge.RECHARGE_NUM
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private String rechargeNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_recharge.USER_ID
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_recharge.CURRENCY
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private String currency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_recharge.RECHARGE_MONEY
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private BigDecimal rechargeMoney;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_recharge.NOTE
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private String note;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_recharge.CREDITED_MONEY
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private BigDecimal creditedMoney;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_recharge.CREDITED_TIME
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private Date creditedTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_recharge.AUDIT_USER
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private String auditUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_recharge.PV_RATE
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private BigDecimal pvRate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_recharge.PV
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private BigDecimal pv;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_recharge.BANK_NAME
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private String bankName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_recharge.BANK_ACCOUNT
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private String bankAccount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_recharge.PLATFORM
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private String platform;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_recharge.PARAM
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private String param;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_recharge.RECHARGE_ID
     *
     * @return the value of user_recharge.RECHARGE_ID
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public String getRechargeId() {
        return rechargeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_recharge.RECHARGE_ID
     *
     * @param rechargeId the value for user_recharge.RECHARGE_ID
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setRechargeId(String rechargeId) {
        this.rechargeId = rechargeId == null ? null : rechargeId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_recharge.RECHARGE_TIME
     *
     * @return the value of user_recharge.RECHARGE_TIME
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public Date getRechargeTime() {
        return rechargeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_recharge.RECHARGE_TIME
     *
     * @param rechargeTime the value for user_recharge.RECHARGE_TIME
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setRechargeTime(Date rechargeTime) {
        this.rechargeTime = rechargeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_recharge.RECHARGE_NUM
     *
     * @return the value of user_recharge.RECHARGE_NUM
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public String getRechargeNum() {
        return rechargeNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_recharge.RECHARGE_NUM
     *
     * @param rechargeNum the value for user_recharge.RECHARGE_NUM
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setRechargeNum(String rechargeNum) {
        this.rechargeNum = rechargeNum == null ? null : rechargeNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_recharge.USER_ID
     *
     * @return the value of user_recharge.USER_ID
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_recharge.USER_ID
     *
     * @param userId the value for user_recharge.USER_ID
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_recharge.CURRENCY
     *
     * @return the value of user_recharge.CURRENCY
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_recharge.CURRENCY
     *
     * @param currency the value for user_recharge.CURRENCY
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_recharge.RECHARGE_MONEY
     *
     * @return the value of user_recharge.RECHARGE_MONEY
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public BigDecimal getRechargeMoney() {
        return rechargeMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_recharge.RECHARGE_MONEY
     *
     * @param rechargeMoney the value for user_recharge.RECHARGE_MONEY
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setRechargeMoney(BigDecimal rechargeMoney) {
        this.rechargeMoney = rechargeMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_recharge.NOTE
     *
     * @return the value of user_recharge.NOTE
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_recharge.NOTE
     *
     * @param note the value for user_recharge.NOTE
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_recharge.CREDITED_MONEY
     *
     * @return the value of user_recharge.CREDITED_MONEY
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public BigDecimal getCreditedMoney() {
        return creditedMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_recharge.CREDITED_MONEY
     *
     * @param creditedMoney the value for user_recharge.CREDITED_MONEY
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setCreditedMoney(BigDecimal creditedMoney) {
        this.creditedMoney = creditedMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_recharge.CREDITED_TIME
     *
     * @return the value of user_recharge.CREDITED_TIME
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public Date getCreditedTime() {
        return creditedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_recharge.CREDITED_TIME
     *
     * @param creditedTime the value for user_recharge.CREDITED_TIME
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setCreditedTime(Date creditedTime) {
        this.creditedTime = creditedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_recharge.AUDIT_USER
     *
     * @return the value of user_recharge.AUDIT_USER
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public String getAuditUser() {
        return auditUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_recharge.AUDIT_USER
     *
     * @param auditUser the value for user_recharge.AUDIT_USER
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setAuditUser(String auditUser) {
        this.auditUser = auditUser == null ? null : auditUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_recharge.PV_RATE
     *
     * @return the value of user_recharge.PV_RATE
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public BigDecimal getPvRate() {
        return pvRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_recharge.PV_RATE
     *
     * @param pvRate the value for user_recharge.PV_RATE
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setPvRate(BigDecimal pvRate) {
        this.pvRate = pvRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_recharge.PV
     *
     * @return the value of user_recharge.PV
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public BigDecimal getPv() {
        return pv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_recharge.PV
     *
     * @param pv the value for user_recharge.PV
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setPv(BigDecimal pv) {
        this.pv = pv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_recharge.BANK_NAME
     *
     * @return the value of user_recharge.BANK_NAME
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_recharge.BANK_NAME
     *
     * @param bankName the value for user_recharge.BANK_NAME
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_recharge.BANK_ACCOUNT
     *
     * @return the value of user_recharge.BANK_ACCOUNT
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public String getBankAccount() {
        return bankAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_recharge.BANK_ACCOUNT
     *
     * @param bankAccount the value for user_recharge.BANK_ACCOUNT
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount == null ? null : bankAccount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_recharge.PLATFORM
     *
     * @return the value of user_recharge.PLATFORM
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_recharge.PLATFORM
     *
     * @param platform the value for user_recharge.PLATFORM
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setPlatform(String platform) {
        this.platform = platform == null ? null : platform.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_recharge.PARAM
     *
     * @return the value of user_recharge.PARAM
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public String getParam() {
        return param;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_recharge.PARAM
     *
     * @param param the value for user_recharge.PARAM
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setParam(String param) {
        this.param = param == null ? null : param.trim();
    }
}