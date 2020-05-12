package com.rbac.learn.service;

import com.rbac.learn.entity.SysAclModule;
import java.util.List;

/**
 * (SysAclModule)表服务接口
 *
 * @author makejava
 * @since 2020-05-12 10:29:49
 */
public interface SysAclModuleService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysAclModule queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SysAclModule> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param sysAclModule 实例对象
     * @return 实例对象
     */
    SysAclModule insert(SysAclModule sysAclModule);

    /**
     * 修改数据
     *
     * @param sysAclModule 实例对象
     * @return 实例对象
     */
    SysAclModule update(SysAclModule sysAclModule);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}