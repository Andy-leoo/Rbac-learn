package com.rbac.learn.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (SysDept)实体类
 *
 * @author makejava
 * @since 2020-05-12 10:30:05
 */
public class SysDept implements Serializable {
    private static final long serialVersionUID = -78206118808074704L;
    /**
    * 部门id
    */
    private Integer id;
    /**
    * 部门名称
    */
    private String name;
    /**
    * 上级部门id
    */
    private Integer parentId;
    /**
    * 部门层级
    */
    private String level;
    /**
    * 部门在当前层级下的顺序，由小到大
    */
    private Integer seq;
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