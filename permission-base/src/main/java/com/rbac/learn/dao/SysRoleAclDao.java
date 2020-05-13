package com.rbac.learn.dao;

import com.rbac.learn.entity.SysRoleAcl;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (SysRoleAcl)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-12 10:30:55
 */
@Mapper
public interface SysRoleAclDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysRoleAcl queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SysRoleAcl> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param sysRoleAcl 实例对象
     * @return 对象列表
     */
    List<SysRoleAcl> queryAll(SysRoleAcl sysRoleAcl);

    /**
     * 新增数据
     *
     * @param sysRoleAcl 实例对象
     * @return 影响行数
     */
    int insert(SysRoleAcl sysRoleAcl);

    /**
     * 修改数据
     *
     * @param sysRoleAcl 实例对象
     * @return 影响行数
     */
    int update(SysRoleAcl sysRoleAcl);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}