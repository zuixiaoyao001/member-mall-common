package com.drawnblue.entity;

import java.math.BigDecimal;
import java.util.Date;

public class UserPairA {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_pair_201312.PAIR_ID
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private String pairId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_pair_201312.DATE
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private Date date;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_pair_201312.BONUS_USER_ID
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private String bonusUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_pair_201312.LEFT_USER
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private BigDecimal leftUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_pair_201312.RIGHT_USER
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private BigDecimal rightUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_pair_201312.LEFT_KEEP
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private BigDecimal leftKeep;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_pair_201312.RIGHT_KEEP
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private BigDecimal rightKeep;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_pair_201312.EACH_PV
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private BigDecimal eachPv;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_pair_201312.SUM_PAIR_PV
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private BigDecimal sumPairPv;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_pair_201312.BONUS_RATE
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private BigDecimal bonusRate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_pair_201312.BONUS_PV
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private BigDecimal bonusPv;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_pair_201312.PAIR_ID
     *
     * @return the value of user_pair_201312.PAIR_ID
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public String getPairId() {
        return pairId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_pair_201312.PAIR_ID
     *
     * @param pairId the value for user_pair_201312.PAIR_ID
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setPairId(String pairId) {
        this.pairId = pairId == null ? null : pairId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_pair_201312.DATE
     *
     * @return the value of user_pair_201312.DATE
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public Date getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_pair_201312.DATE
     *
     * @param date the value for user_pair_201312.DATE
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_pair_201312.BONUS_USER_ID
     *
     * @return the value of user_pair_201312.BONUS_USER_ID
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public String getBonusUserId() {
        return bonusUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_pair_201312.BONUS_USER_ID
     *
     * @param bonusUserId the value for user_pair_201312.BONUS_USER_ID
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setBonusUserId(String bonusUserId) {
        this.bonusUserId = bonusUserId == null ? null : bonusUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_pair_201312.LEFT_USER
     *
     * @return the value of user_pair_201312.LEFT_USER
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public BigDecimal getLeftUser() {
        return leftUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_pair_201312.LEFT_USER
     *
     * @param leftUser the value for user_pair_201312.LEFT_USER
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setLeftUser(BigDecimal leftUser) {
        this.leftUser = leftUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_pair_201312.RIGHT_USER
     *
     * @return the value of user_pair_201312.RIGHT_USER
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public BigDecimal getRightUser() {
        return rightUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_pair_201312.RIGHT_USER
     *
     * @param rightUser the value for user_pair_201312.RIGHT_USER
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setRightUser(BigDecimal rightUser) {
        this.rightUser = rightUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_pair_201312.LEFT_KEEP
     *
     * @return the value of user_pair_201312.LEFT_KEEP
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public BigDecimal getLeftKeep() {
        return leftKeep;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_pair_201312.LEFT_KEEP
     *
     * @param leftKeep the value for user_pair_201312.LEFT_KEEP
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setLeftKeep(BigDecimal leftKeep) {
        this.leftKeep = leftKeep;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_pair_201312.RIGHT_KEEP
     *
     * @return the value of user_pair_201312.RIGHT_KEEP
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public BigDecimal getRightKeep() {
        return rightKeep;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_pair_201312.RIGHT_KEEP
     *
     * @param rightKeep the value for user_pair_201312.RIGHT_KEEP
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setRightKeep(BigDecimal rightKeep) {
        this.rightKeep = rightKeep;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_pair_201312.EACH_PV
     *
     * @return the value of user_pair_201312.EACH_PV
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public BigDecimal getEachPv() {
        return eachPv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_pair_201312.EACH_PV
     *
     * @param eachPv the value for user_pair_201312.EACH_PV
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setEachPv(BigDecimal eachPv) {
        this.eachPv = eachPv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_pair_201312.SUM_PAIR_PV
     *
     * @return the value of user_pair_201312.SUM_PAIR_PV
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public BigDecimal getSumPairPv() {
        return sumPairPv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_pair_201312.SUM_PAIR_PV
     *
     * @param sumPairPv the value for user_pair_201312.SUM_PAIR_PV
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setSumPairPv(BigDecimal sumPairPv) {
        this.sumPairPv = sumPairPv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_pair_201312.BONUS_RATE
     *
     * @return the value of user_pair_201312.BONUS_RATE
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public BigDecimal getBonusRate() {
        return bonusRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_pair_201312.BONUS_RATE
     *
     * @param bonusRate the value for user_pair_201312.BONUS_RATE
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setBonusRate(BigDecimal bonusRate) {
        this.bonusRate = bonusRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_pair_201312.BONUS_PV
     *
     * @return the value of user_pair_201312.BONUS_PV
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public BigDecimal getBonusPv() {
        return bonusPv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_pair_201312.BONUS_PV
     *
     * @param bonusPv the value for user_pair_201312.BONUS_PV
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setBonusPv(BigDecimal bonusPv) {
        this.bonusPv = bonusPv;
    }
}