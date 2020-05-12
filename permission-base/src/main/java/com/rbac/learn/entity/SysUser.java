package com.rbac.learn.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (SysUser)实体类
 *
 * @author makejava
 * @since 2020-05-12 10:31:20
 */
public class SysUser implements Serializable {
    private static final long serialVersionUID = -40196914952462615L;
    /**
    * 用户id
    */
    private Integer id;
    /**
    * 用户名称
    */
    private String username;
    /**
    * 手机号
    */
    private String telephone;
    /**
    * 邮箱
    */
    private String mail;
    /**
    * 加密后的密码
    */
    private String password;
    /**
    * 用户所在部门的id
    */
    private Integer deptId;
    /**
    * 状态，1：正常，0：冻结状态，2：删除
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
    * 最后一次更新时间
    */
    private Date operateTime;
    /**
    * 最后一次更新者的ip地址
    */
    private String operateIp;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
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