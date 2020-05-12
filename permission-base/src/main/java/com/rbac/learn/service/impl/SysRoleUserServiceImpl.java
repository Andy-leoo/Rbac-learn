package com.rbac.learn.service.impl;

import com.rbac.learn.entity.SysRoleUser;
import com.rbac.learn.dao.SysRoleUserDao;
import com.rbac.learn.service.SysRoleUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SysRoleUser)表服务实现类
 *
 * @author makejava
 * @since 2020-05-12 10:31:08
 */
@Service("sysRoleUserService")
public class SysRoleUserServiceImpl implements SysRoleUserService {
    @Resource
    private SysRoleUserDao sysRoleUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysRoleUser queryById(Integer id) {
        return this.sysRoleUserDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SysRoleUser> queryAllByLimit(int offset, int limit) {
        return this.sysRoleUserDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param sysRoleUser 实例对象
     * @return 实例对象
     */
    @Override
    public SysRoleUser insert(SysRoleUser sysRoleUser) {
        this.sysRoleUserDao.insert(sysRoleUser);
        return sysRoleUser;
    }

    /**
     * 修改数据
     *
     * @param sysRoleUser 实例对象
     * @return 实例对象
     */
    @Override
    public SysRoleUser update(SysRoleUser sysRoleUser) {
        this.sysRoleUserDao.update(sysRoleUser);
        return this.queryById(sysRoleUser.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.sysRoleUserDao.deleteById(id) > 0;
    }
}