package com.rbac.learn.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (SysAcl)实体类
 *
 * @author makejava
 * @since 2020-05-12 10:29:08
 */
public class SysAcl implements Serializable {
    private static final long serialVersionUID = -40671088627674570L;
    /**
    * 权限id
    */
    private Integer id;
    /**
    * 权限码
    */
    private String code;
    /**
    * 权限名称
    */
    private String name;
    /**
    * 权限所在的权限模块id
    */
    private Integer aclModuleId;
    /**
    * 请求的url, 可以填正则表达式
    */
    private String url;
    /**
    * 类型，1：菜单，2：按钮，3：其他
    */
    private Integer type;
    /**
    * 状态，1：正常，0：冻结
    */
    private Integer status;
    /**
    * 权限在当前模块下的顺序，由小到大
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
    * 最后一次更新时间
    */
    private Date operateTime;
    /**
    * 最后一个更新者的ip地址
    */
    private String operateIp;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAclModuleId() {
        return aclModuleId;
    }

    public void setAclModuleId(Integer aclModuleId) {
        this.aclModuleId = aclModuleId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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