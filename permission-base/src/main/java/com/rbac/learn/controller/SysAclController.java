package com.rbac.learn.controller;

import com.rbac.learn.entity.SysAcl;
import com.rbac.learn.service.SysAclService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (SysAcl)表控制层
 *
 * @author makejava
 * @since 2020-05-12 10:29:14
 */
@RestController
@RequestMapping("sysAcl")
public class SysAclController {
    /**
     * 服务对象
     */
    @Resource
    private SysAclService sysAclService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysAcl selectOne(Integer id) {
        return this.sysAclService.queryById(id);
    }

}