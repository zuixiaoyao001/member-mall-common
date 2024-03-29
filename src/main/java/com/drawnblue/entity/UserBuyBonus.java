package com.drawnblue.entity;

import java.math.BigDecimal;
import java.util.Date;

public class UserBuyBonus {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_buy_bonus.BUY_BONUS_ID
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private String buyBonusId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_buy_bonus.BONUS_MONTH
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private String bonusMonth;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_buy_bonus.CAL_TIME
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private Date calTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_buy_bonus.BONUS_USER_ID
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private String bonusUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_buy_bonus.BUY_PV
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private BigDecimal buyPv;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_buy_bonus.BONUS_RATE
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private BigDecimal bonusRate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_buy_bonus.BONUS_PV
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private BigDecimal bonusPv;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_buy_bonus.BUY_BONUS_ID
     *
     * @return the value of user_buy_bonus.BUY_BONUS_ID
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public String getBuyBonusId() {
        return buyBonusId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_buy_bonus.BUY_BONUS_ID
     *
     * @param buyBonusId the value for user_buy_bonus.BUY_BONUS_ID
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setBuyBonusId(String buyBonusId) {
        this.buyBonusId = buyBonusId == null ? null : buyBonusId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_buy_bonus.BONUS_MONTH
     *
     * @return the value of user_buy_bonus.BONUS_MONTH
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public String getBonusMonth() {
        return bonusMonth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_buy_bonus.BONUS_MONTH
     *
     * @param bonusMonth the value for user_buy_bonus.BONUS_MONTH
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setBonusMonth(String bonusMonth) {
        this.bonusMonth = bonusMonth == null ? null : bonusMonth.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_buy_bonus.CAL_TIME
     *
     * @return the value of user_buy_bonus.CAL_TIME
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public Date getCalTime() {
        return calTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_buy_bonus.CAL_TIME
     *
     * @param calTime the value for user_buy_bonus.CAL_TIME
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setCalTime(Date calTime) {
        this.calTime = calTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_buy_bonus.BONUS_USER_ID
     *
     * @return the value of user_buy_bonus.BONUS_USER_ID
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public String getBonusUserId() {
        return bonusUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_buy_bonus.BONUS_USER_ID
     *
     * @param bonusUserId the value for user_buy_bonus.BONUS_USER_ID
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setBonusUserId(String bonusUserId) {
        this.bonusUserId = bonusUserId == null ? null : bonusUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_buy_bonus.BUY_PV
     *
     * @return the value of user_buy_bonus.BUY_PV
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public BigDecimal getBuyPv() {
        return buyPv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_buy_bonus.BUY_PV
     *
     * @param buyPv the value for user_buy_bonus.BUY_PV
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setBuyPv(BigDecimal buyPv) {
        this.buyPv = buyPv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_buy_bonus.BONUS_RATE
     *
     * @return the value of user_buy_bonus.BONUS_RATE
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public BigDecimal getBonusRate() {
        return bonusRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_buy_bonus.BONUS_RATE
     *
     * @param bonusRate the value for user_buy_bonus.BONUS_RATE
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setBonusRate(BigDecimal bonusRate) {
        this.bonusRate = bonusRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_buy_bonus.BONUS_PV
     *
     * @return the value of user_buy_bonus.BONUS_PV
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public BigDecimal getBonusPv() {
        return bonusPv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_buy_bonus.BONUS_PV
     *
     * @param bonusPv the value for user_buy_bonus.BONUS_PV
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setBonusPv(BigDecimal bonusPv) {
        this.bonusPv = bonusPv;
    }
}