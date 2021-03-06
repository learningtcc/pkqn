package eccrm.base.org.domain;


import com.ycrl.base.common.CommonDomain;
import com.ycrl.utils.tree.PathTree;
import com.ycrl.utils.tree.StaticTree;

import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 组织机构
 * Generated by yanhx on 2014-10-13.
 */
public class Organization extends CommonDomain implements PathTree<Organization, String>, StaticTree<Organization, String> {

    /**
     * 状态：启用
     */
    public static final String STATUS_ACTIVE = "1";
    /**
     * 状态：未启用
     */
    public static final String STATUS_INACTIVE = "0";
    private String longName;
    private String name;
    private String pinyin;
    private String jianpin;
    private String guid;
    private Organization parent;
    private String parentId;
    private String parentName;
    private Integer sequenceNo;
    private String orgPath;
    private String businessArea;
    private String busiTypeId;//系统
    private String busType;//机构业务状态
    private String orgType;
    private Integer isOrg;
    private String path;
    private Boolean isParent;
    /**
     * 是否为直属
     */
    private Boolean isDirectly;
    /**
     * 开业时间
     */
    private Date openDate;

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    @Transient
    private List<Organization> children;

    public Organization getParent() {
        return parent;
    }

    public void setParent(Organization parent) {
        this.parent = parent;
    }

    public Organization addChild(Organization child) {
        if (children == null) {
            children = new ArrayList<Organization>();
        }
        children.add(child);
        return this;
    }

    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String getJianpin() {
        return jianpin;
    }

    public void setJianpin(String jianpin) {
        this.jianpin = jianpin;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }


    public Integer getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(Integer sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    public String getOrgPath() {
        return orgPath;
    }

    public void setOrgPath(String orgPath) {
        this.orgPath = orgPath;
    }


    public String getBusinessArea() {
        return businessArea;
    }

    public void setBusinessArea(String businessArea) {
        this.businessArea = businessArea;
    }

    public String getBusiTypeId() {
        return busiTypeId;
    }

    public void setBusiTypeId(String busiTypeId) {
        this.busiTypeId = busiTypeId;
    }

    public String getOrgType() {
        return orgType;
    }

    public void setOrgType(String orgType) {
        this.orgType = orgType;
    }

    public Integer getIsOrg() {
        return isOrg;
    }

    public void setIsOrg(Integer isOrg) {
        this.isOrg = isOrg;
    }

    public List<Organization> getChildren() {
        return children;
    }

    public void setChildren(List<Organization> children) {
        this.children = children;
    }


    public Organization() {
    }

    public Boolean getIsParent() {
        return isParent;
    }

    public void setIsParent(Boolean isParent) {
        this.isParent = isParent;
    }

    public Boolean getIsDirectly() {
        return isDirectly;
    }

    public void setIsDirectly(Boolean isDirectly) {
        this.isDirectly = isDirectly;
    }

    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }
}
