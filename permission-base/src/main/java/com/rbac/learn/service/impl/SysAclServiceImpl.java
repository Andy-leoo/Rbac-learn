package com.rbac.learn.service.impl;

import com.rbac.learn.entity.SysAcl;
import com.rbac.learn.dao.SysAclDao;
import com.rbac.learn.service.SysAclService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SysAcl)表服务实现类
 *
 * @author makejava
 * @since 2020-05-12 10:29:12
 */
@Service("sysAclService")
public class SysAclServiceImpl implements SysAclService {
    @Resource
    private SysAclDao sysAclDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysAcl queryById(Integer id) {
        return this.sysAclDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SysAcl> queryAllByLimit(int offset, int limit) {
        return this.sysAclDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param sysAcl 实例对象
     * @return 实例对象
     */
    @Override
    public SysAcl insert(SysAcl sysAcl) {
        this.sysAclDao.insert(sysAcl);
        return sysAcl;
    }

    /**
     * 修改数据
     *
     * @param sysAcl 实例对象
     * @return 实例对象
     */
    @Override
    public SysAcl update(SysAcl sysAcl) {
        this.sysAclDao.update(sysAcl);
        return this.queryById(sysAcl.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.sysAclDao.deleteById(id) > 0;
    }
}