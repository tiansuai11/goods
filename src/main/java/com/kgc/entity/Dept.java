package com.kgc.entity;

public class Dept {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept.deptNo
     *
     * @mbggenerated Wed Jun 12 19:57:34 GMT+08:00 2019
     */
    private Integer deptno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept.deptName
     *
     * @mbggenerated Wed Jun 12 19:57:34 GMT+08:00 2019
     */
    private String deptname;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept.deptNo
     *
     * @return the value of dept.deptNo
     *
     * @mbggenerated Wed Jun 12 19:57:34 GMT+08:00 2019
     */
    public Integer getDeptno() {
        return deptno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept.deptNo
     *
     * @param deptno the value for dept.deptNo
     *
     * @mbggenerated Wed Jun 12 19:57:34 GMT+08:00 2019
     */
    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept.deptName
     *
     * @return the value of dept.deptName
     *
     * @mbggenerated Wed Jun 12 19:57:34 GMT+08:00 2019
     */
    public String getDeptname() {
        return deptname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept.deptName
     *
     * @param deptname the value for dept.deptName
     *
     * @mbggenerated Wed Jun 12 19:57:34 GMT+08:00 2019
     */
    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }
}