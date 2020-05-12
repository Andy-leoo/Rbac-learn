package com.rbac.learn.controller;

import com.rbac.learn.entity.SysRoleUser;
import com.rbac.learn.service.SysRoleUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (SysRoleUser)表控制层
 *
 * @author makejava
 * @since 2020-05-12 10:31:08
 */
@RestController
@RequestMapping("sysRoleUser")
public class SysRoleUserController {
    /**
     * 服务对象
     */
    @Resource
    private SysRoleUserService sysRoleUserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysRoleUser selectOne(Integer id) {
        return this.sysRoleUserService.queryById(id);
    }

}