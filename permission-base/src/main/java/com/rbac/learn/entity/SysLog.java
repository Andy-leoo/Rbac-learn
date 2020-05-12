package com.rbac.learn.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (SysLog)实体类
 *
 * @author makejava
 * @since 2020-05-12 10:30:21
 */
public class SysLog implements Serializable {
    private static final long serialVersionUID = 558498940249004864L;
    
    private Integer id;
    /**
    * 权限更新的类型，1：部门，2：用户，3：权限模块，4：权限，5：角色，6：角色用户关系，7：角色权限关系
    */
    private Integer type;
    /**
    * 基于type后指定的对象id，比如用户、权限、角色等表的主键
    */
    private Integer targetId;
    /**
    * 旧值
    */
    private String oldValue;
    /**
    * 新值
    */
    private String newValue;
    /**
    * 操作者
    */
    private String operator;
    /**
    * 最后一次更新的时间
    */
    private Date operateTime;
    /**
    * 最后一次更新者的ip地址
    */
    private String operateIp;
    /**
    * 当前是否复原过，0：没有，1：复原过
    */
    private Integer status;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getTargetId() {
        return targetId;
    }

    public void setTargetId(Integer targetId) {
        this.targetId = targetId;
    }

    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}