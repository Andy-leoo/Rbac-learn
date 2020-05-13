package com.rbac.learn.dao;

import com.rbac.learn.entity.SysAcl;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * (SysAcl)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-12 10:29:12
 */
@Mapper
public interface SysAclDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysAcl queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SysAcl> queryAllByLimit(int offset, int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param sysAcl 实例对象
     * @return 对象列表
     */
    List<SysAcl> queryAll(SysAcl sysAcl);

    /**
     * 新增数据
     *
     * @param sysAcl 实例对象
     * @return 影响行数
     */
    int insert(SysAcl sysAcl);

    /**
     * 修改数据
     *
     * @param sysAcl 实例对象
     * @return 影响行数
     */
    int update(SysAcl sysAcl);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}