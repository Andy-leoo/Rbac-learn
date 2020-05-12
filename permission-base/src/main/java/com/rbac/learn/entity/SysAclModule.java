package com.rbac.learn.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (SysAclModule)实体类
 *
 * @author makejava
 * @since 2020-05-12 10:29:49
 */
public class SysAclModule implements Serializable {
    private static final long serialVersionUID = -10856569498764904L;
    /**
    * 权限模块id
    */
    private Integer id;
    /**
    * 权限模块名称
    */
    private String name;
    /**
    * 上级权限模块id
    */
    private Integer parentId;
    /**
    * 权限模块层级
    */
    private String level;
    /**
    * 权限模块在当前层级下的顺序，由小到大
    */
    private Integer seq;
    /**
    * 状态，1：正常，0：冻结
    */
    private Integer status;
    /**
    * 备注
    */
    private String remark;
    /**
    * 操作者
    */
    private String operator;
    /**
    * 最后一次操作时间
    */
    private Date operateTime;
    /**
    * 最后一次更新操作者的ip地址
    */
    private String operateIp;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    public String getOperateIp() {
        return operateIp;
    }

    public void setOperateIp(String operateIp) {
        this.operateIp = operateIp;
    }

}