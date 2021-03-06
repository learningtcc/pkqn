package com.michael.spec.vo;

import com.ycrl.base.common.CommonVo;

import java.util.Date;

/**
 * @author Michael
 */
public class PoorTeenagersVo extends CommonVo {
    private String name;

    private String sex;     // 性别
    private String sexName;
    private String mz;      // 民族
    private String mzName;
    private String zzmm;    // 政治面貌
    private String zzmmName;

    // 照片
    private String picture;
    private Date birthday;  // 出生年月
    private Integer age;    // 年龄
    private String phone;
    private String qq;
    // 健康状况
    private String health;
    private String healthName;

    // 身份证号
    private String idCard;

    // 兴趣爱好
    private String interest;
    private String orgId;
    private String orgName;


    private String school;
    private String classes;

    private String parentName;
    // 贫困原因
    private String reason;
    // 家庭年收入
    private String income;
    private String incomeName;
    private String address;
    // 基本情况描述
    private String content;

    // 慰问总金额
    private Double condoleMoney;

    // 慰问次数
    private Integer condoleTimes;

    public Double getCondoleMoney() {
        return condoleMoney;
    }

    public void setCondoleMoney(Double condoleMoney) {
        this.condoleMoney = condoleMoney;
    }

    public Integer getCondoleTimes() {
        return condoleTimes;
    }

    public void setCondoleTimes(Integer condoleTimes) {
        this.condoleTimes = condoleTimes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSexName() {
        return sexName;
    }

    public void setSexName(String sexName) {
        this.sexName = sexName;
    }

    public String getMz() {
        return mz;
    }

    public void setMz(String mz) {
        this.mz = mz;
    }

    public String getMzName() {
        return mzName;
    }

    public void setMzName(String mzName) {
        this.mzName = mzName;
    }

    public String getZzmm() {
        return zzmm;
    }

    public void setZzmm(String zzmm) {
        this.zzmm = zzmm;
    }

    public String getZzmmName() {
        return zzmmName;
    }

    public void setZzmmName(String zzmmName) {
        this.zzmmName = zzmmName;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getHealthName() {
        return healthName;
    }

    public void setHealthName(String healthName) {
        this.healthName = healthName;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public String getIncomeName() {
        return incomeName;
    }

    public void setIncomeName(String incomeName) {
        this.incomeName = incomeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
