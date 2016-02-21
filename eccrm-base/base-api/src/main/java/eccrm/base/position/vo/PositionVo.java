package eccrm.base.position.vo;


import com.ycrl.base.common.CommonVo;
import eccrm.base.employee.vo.EmployeeVo;

import java.util.Date;
import java.util.List;

/**
* Generated by chenl on 2014-10-11.
*/

public class PositionVo extends CommonVo {

    private  String name;
    private  String code;
    private  String  classifyId;
    private  String  classifyName;
    private  String pinyin;//全拼
    private  String shortName;//简称
    private  String jianPin;//说明
    private Date startDate;//启用时间
    private  Date endDate;//失效时间
    private  String roleType;//岗位类型
    private  String roleTypeName;//岗位类型
    private  String busiTypeNo;//所属系统
    private  String busiTypeName;//所属系统
    private  String organizationId;//机构
    private  String organizationName;//机构
    private  String statusName;//计划人员
    private  Integer empCount;//计划人员
    private  Integer minEmpCount;//最少人员
    private  Boolean isAlert;//是否预警
    private List<EmployeeVo> employeeVos;

    public List<EmployeeVo> getEmployeeVos() {
        return employeeVos;
    }

    public void setEmployeeVos(List<EmployeeVo> employeeVos) {
        this.employeeVos = employeeVos;
    }

    public String getRoleTypeName() {
        return roleTypeName;
    }

    public void setRoleTypeName(String roleTypeName) {
        this.roleTypeName = roleTypeName;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getBusiTypeName() {
        return busiTypeName;
    }

    public void setBusiTypeName(String busiTypeName) {
        this.busiTypeName = busiTypeName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getClassifyId() {
        return classifyId;
    }

    public void setClassifyId(String classifyId) {
        this.classifyId = classifyId;
    }

    public String getClassifyName() {
        return classifyName;
    }

    public void setClassifyName(String classifyName) {

        this.classifyName = classifyName;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getJianPin() {
        return jianPin;
    }

    public void setJianPin(String jianPin) {
        this.jianPin = jianPin;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    public String getBusiTypeNo() {
        return busiTypeNo;
    }

    public void setBusiTypeNo(String busiTypeNo) {
        this.busiTypeNo = busiTypeNo;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public Integer getEmpCount() {
        return empCount;
    }

    public void setEmpCount(Integer empCount) {
        this.empCount = empCount;
    }

    public Integer getMinEmpCount() {
        return minEmpCount;
    }

    public void setMinEmpCount(Integer minEmpCount) {
        this.minEmpCount = minEmpCount;
    }

    public Boolean getIsAlert() {
        return isAlert;
    }

    public void setIsAlert(Boolean isAlert) {
        this.isAlert = isAlert;
    }

}
