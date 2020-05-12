package com.rbac.learn.controller;

import com.rbac.learn.entity.SysAclModule;
import com.rbac.learn.service.SysAclModuleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (SysAclModule)表控制层
 *
 * @author makejava
 * @since 2020-05-12 10:29:49
 */
@RestController
@RequestMapping("sysAclModule")
public class SysAclModuleController {
    /**
     * 服务对象
     */
    @Resource
    private SysAclModuleService sysAclModuleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysAclModule selectOne(Integer id) {
        return this.sysAclModuleService.queryById(id);
    }

}