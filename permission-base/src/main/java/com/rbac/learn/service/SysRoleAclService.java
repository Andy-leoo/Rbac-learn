package com.rbac.learn.service;

import com.rbac.learn.entity.SysRoleAcl;
import java.util.List;

/**
 * (SysRoleAcl)表服务接口
 *
 * @author makejava
 * @since 2020-05-12 10:30:55
 */
public interface SysRoleAclService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysRoleAcl queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SysRoleAcl> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param sysRoleAcl 实例对象
     * @return 实例对象
     */
    SysRoleAcl insert(SysRoleAcl sysRoleAcl);

    /**
     * 修改数据
     *
     * @param sysRoleAcl 实例对象
     * @return 实例对象
     */
    SysRoleAcl update(SysRoleAcl sysRoleAcl);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}