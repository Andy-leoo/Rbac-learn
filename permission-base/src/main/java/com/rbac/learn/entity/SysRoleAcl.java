package com.rbac.learn.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (SysRoleAcl)实体类
 *
 * @author makejava
 * @since 2020-05-12 10:30:55
 */
public class SysRoleAcl implements Serializable {
    private static final long serialVersionUID = 411669034368492499L;
    
    private Integer id;
    /**
    * 角色id
    */
    private Integer roleId;
    /**
    * 权限id
    */
    private Integer aclId;
    /**
    * 操作者
    */
    private String operator;
    /**
    * 最后一次更新的时间
    */
    private Date operateTime;
    /**
    * 最后一次更新者的ip
    */
    private String operateIp;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getAclId() {
        return aclId;
    }

    public void setAclId(Integer aclId) {
        this.aclId = aclId;
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