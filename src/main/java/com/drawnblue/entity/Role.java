package com.drawnblue.entity;

import java.util.Date;

public class Role {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column au_role.id
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column au_role.roleCode
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private String rolecode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column au_role.roleName
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private String rolename;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column au_role.createDate
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private Date createdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column au_role.isStart
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private Integer isstart;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column au_role.createdBy
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    private String createdby;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column au_role.id
     *
     * @return the value of au_role.id
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column au_role.id
     *
     * @param id the value for au_role.id
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column au_role.roleCode
     *
     * @return the value of au_role.roleCode
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public String getRolecode() {
        return rolecode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column au_role.roleCode
     *
     * @param rolecode the value for au_role.roleCode
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setRolecode(String rolecode) {
        this.rolecode = rolecode == null ? null : rolecode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column au_role.roleName
     *
     * @return the value of au_role.roleName
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public String getRolename() {
        return rolename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column au_role.roleName
     *
     * @param rolename the value for au_role.roleName
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column au_role.createDate
     *
     * @return the value of au_role.createDate
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column au_role.createDate
     *
     * @param createdate the value for au_role.createDate
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column au_role.isStart
     *
     * @return the value of au_role.isStart
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public Integer getIsstart() {
        return isstart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column au_role.isStart
     *
     * @param isstart the value for au_role.isStart
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setIsstart(Integer isstart) {
        this.isstart = isstart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column au_role.createdBy
     *
     * @return the value of au_role.createdBy
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public String getCreatedby() {
        return createdby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column au_role.createdBy
     *
     * @param createdby the value for au_role.createdBy
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    public void setCreatedby(String createdby) {
        this.createdby = createdby == null ? null : createdby.trim();
    }
}