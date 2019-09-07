package com.drawnblue.entity;

import java.math.BigDecimal;

public class OrderList {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_list.LIST_ID
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private String listId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_list.GOODS_ID
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private String goodsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_list.GOODS_SN
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private String goodsSn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_list.GOODS_NAME
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private String goodsName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_list.GOODS_FORMAT
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private String goodsFormat;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_list.GOODS_NUM
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private BigDecimal goodsNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_list.EACH_PRICE
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private BigDecimal eachPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_list.SUM_PRICE
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private BigDecimal sumPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_list.DISCOUNT
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private BigDecimal discount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_list.REAL_PRICE
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private BigDecimal realPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_list.CURRENCY
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private String currency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_list.REAL_PV
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private BigDecimal realPv;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_list.PV_RATE
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private BigDecimal pvRate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_list.LIST_ID
     *
     * @return the value of order_list.LIST_ID
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public String getListId() {
        return listId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_list.LIST_ID
     *
     * @param listId the value for order_list.LIST_ID
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setListId(String listId) {
        this.listId = listId == null ? null : listId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_list.GOODS_ID
     *
     * @return the value of order_list.GOODS_ID
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public String getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_list.GOODS_ID
     *
     * @param goodsId the value for order_list.GOODS_ID
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_list.GOODS_SN
     *
     * @return the value of order_list.GOODS_SN
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public String getGoodsSn() {
        return goodsSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_list.GOODS_SN
     *
     * @param goodsSn the value for order_list.GOODS_SN
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn == null ? null : goodsSn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_list.GOODS_NAME
     *
     * @return the value of order_list.GOODS_NAME
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_list.GOODS_NAME
     *
     * @param goodsName the value for order_list.GOODS_NAME
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_list.GOODS_FORMAT
     *
     * @return the value of order_list.GOODS_FORMAT
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public String getGoodsFormat() {
        return goodsFormat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_list.GOODS_FORMAT
     *
     * @param goodsFormat the value for order_list.GOODS_FORMAT
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setGoodsFormat(String goodsFormat) {
        this.goodsFormat = goodsFormat == null ? null : goodsFormat.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_list.GOODS_NUM
     *
     * @return the value of order_list.GOODS_NUM
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public BigDecimal getGoodsNum() {
        return goodsNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_list.GOODS_NUM
     *
     * @param goodsNum the value for order_list.GOODS_NUM
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setGoodsNum(BigDecimal goodsNum) {
        this.goodsNum = goodsNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_list.EACH_PRICE
     *
     * @return the value of order_list.EACH_PRICE
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public BigDecimal getEachPrice() {
        return eachPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_list.EACH_PRICE
     *
     * @param eachPrice the value for order_list.EACH_PRICE
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setEachPrice(BigDecimal eachPrice) {
        this.eachPrice = eachPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_list.SUM_PRICE
     *
     * @return the value of order_list.SUM_PRICE
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public BigDecimal getSumPrice() {
        return sumPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_list.SUM_PRICE
     *
     * @param sumPrice the value for order_list.SUM_PRICE
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setSumPrice(BigDecimal sumPrice) {
        this.sumPrice = sumPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_list.DISCOUNT
     *
     * @return the value of order_list.DISCOUNT
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_list.DISCOUNT
     *
     * @param discount the value for order_list.DISCOUNT
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_list.REAL_PRICE
     *
     * @return the value of order_list.REAL_PRICE
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public BigDecimal getRealPrice() {
        return realPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_list.REAL_PRICE
     *
     * @param realPrice the value for order_list.REAL_PRICE
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setRealPrice(BigDecimal realPrice) {
        this.realPrice = realPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_list.CURRENCY
     *
     * @return the value of order_list.CURRENCY
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_list.CURRENCY
     *
     * @param currency the value for order_list.CURRENCY
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_list.REAL_PV
     *
     * @return the value of order_list.REAL_PV
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public BigDecimal getRealPv() {
        return realPv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_list.REAL_PV
     *
     * @param realPv the value for order_list.REAL_PV
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setRealPv(BigDecimal realPv) {
        this.realPv = realPv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_list.PV_RATE
     *
     * @return the value of order_list.PV_RATE
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public BigDecimal getPvRate() {
        return pvRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_list.PV_RATE
     *
     * @param pvRate the value for order_list.PV_RATE
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setPvRate(BigDecimal pvRate) {
        this.pvRate = pvRate;
    }
}