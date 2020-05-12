package com.rbac.learn.service.impl;

import com.rbac.learn.entity.SysRoleAcl;
import com.rbac.learn.dao.SysRoleAclDao;
import com.rbac.learn.service.SysRoleAclService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SysRoleAcl)表服务实现类
 *
 * @author makejava
 * @since 2020-05-12 10:30:55
 */
@Service("sysRoleAclService")
public class SysRoleAclServiceImpl implements SysRoleAclService {
    @Resource
    private SysRoleAclDao sysRoleAclDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysRoleAcl queryById(Integer id) {
        return this.sysRoleAclDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SysRoleAcl> queryAllByLimit(int offset, int limit) {
        return this.sysRoleAclDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param sysRoleAcl 实例对象
     * @return 实例对象
     */
    @Override
    public SysRoleAcl insert(SysRoleAcl sysRoleAcl) {
        this.sysRoleAclDao.insert(sysRoleAcl);
        return sysRoleAcl;
    }

    /**
     * 修改数据
     *
     * @param sysRoleAcl 实例对象
     * @return 实例对象
     */
    @Override
    public SysRoleAcl update(SysRoleAcl sysRoleAcl) {
        this.sysRoleAclDao.update(sysRoleAcl);
        return this.queryById(sysRoleAcl.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.sysRoleAclDao.deleteById(id) > 0;
    }
}