package com.rbac.learn.controller;

import com.rbac.learn.entity.SysRoleAcl;
import com.rbac.learn.service.SysRoleAclService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (SysRoleAcl)表控制层
 *
 * @author makejava
 * @since 2020-05-12 10:30:55
 */
@RestController
@RequestMapping("sysRoleAcl")
public class SysRoleAclController {
    /**
     * 服务对象
     */
    @Resource
    private SysRoleAclService sysRoleAclService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysRoleAcl selectOne(Integer id) {
        return this.sysRoleAclService.queryById(id);
    }

}