package com.rbac.learn.controller;

import com.rbac.learn.entity.SysUser;
import com.rbac.learn.service.SysUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SysUser)表控制层
 *
 * @author makejava
 * @since 2020-05-12 10:31:20
 */
@RestController
@RequestMapping("/sysUser")
public class SysUserController {
    /**
     * 服务对象
     */
    @Resource
    private SysUserService sysUserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/selectOne/{id}")
    public SysUser selectOne(@PathVariable(value = "id") Integer id) {
        return this.sysUserService.queryById(id);
    }

    @RequestMapping(value = "/selectUserAll" ,method = RequestMethod.POST)
    public String selectUserAll(){
        return "/allUser";
    }
}