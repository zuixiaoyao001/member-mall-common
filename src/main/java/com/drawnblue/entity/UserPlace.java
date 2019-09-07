package com.drawnblue.entity;

import java.math.BigDecimal;
import java.util.Date;

public class UserPlace {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_place.PLACE_ID
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private String placeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_place.PLACE_TIME
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private Date placeTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_place.BONUS_USER_ID
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private String bonusUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_place.USER_ID
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_place.BUY_PV
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private BigDecimal buyPv;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_place.BONUS_RATE
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private BigDecimal bonusRate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_place.BONUS_PV
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private BigDecimal bonusPv;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_place.PLACE_ID
     *
     * @return the value of user_place.PLACE_ID
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public String getPlaceId() {
        return placeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_place.PLACE_ID
     *
     * @param placeId the value for user_place.PLACE_ID
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setPlaceId(String placeId) {
        this.placeId = placeId == null ? null : placeId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_place.PLACE_TIME
     *
     * @return the value of user_place.PLACE_TIME
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public Date getPlaceTime() {
        return placeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_place.PLACE_TIME
     *
     * @param placeTime the value for user_place.PLACE_TIME
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setPlaceTime(Date placeTime) {
        this.placeTime = placeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_place.BONUS_USER_ID
     *
     * @return the value of user_place.BONUS_USER_ID
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public String getBonusUserId() {
        return bonusUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_place.BONUS_USER_ID
     *
     * @param bonusUserId the value for user_place.BONUS_USER_ID
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setBonusUserId(String bonusUserId) {
        this.bonusUserId = bonusUserId == null ? null : bonusUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_place.USER_ID
     *
     * @return the value of user_place.USER_ID
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_place.USER_ID
     *
     * @param userId the value for user_place.USER_ID
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_place.BUY_PV
     *
     * @return the value of user_place.BUY_PV
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public BigDecimal getBuyPv() {
        return buyPv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_place.BUY_PV
     *
     * @param buyPv the value for user_place.BUY_PV
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setBuyPv(BigDecimal buyPv) {
        this.buyPv = buyPv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_place.BONUS_RATE
     *
     * @return the value of user_place.BONUS_RATE
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public BigDecimal getBonusRate() {
        return bonusRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_place.BONUS_RATE
     *
     * @param bonusRate the value for user_place.BONUS_RATE
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setBonusRate(BigDecimal bonusRate) {
        this.bonusRate = bonusRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_place.BONUS_PV
     *
     * @return the value of user_place.BONUS_PV
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public BigDecimal getBonusPv() {
        return bonusPv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_place.BONUS_PV
     *
     * @param bonusPv the value for user_place.BONUS_PV
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setBonusPv(BigDecimal bonusPv) {
        this.bonusPv = bonusPv;
    }
}