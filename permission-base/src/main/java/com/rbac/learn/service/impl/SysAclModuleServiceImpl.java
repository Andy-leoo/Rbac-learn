package com.rbac.learn.service.impl;

import com.rbac.learn.entity.SysAclModule;
import com.rbac.learn.dao.SysAclModuleDao;
import com.rbac.learn.service.SysAclModuleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SysAclModule)表服务实现类
 *
 * @author makejava
 * @since 2020-05-12 10:29:49
 */
@Service("sysAclModuleService")
public class SysAclModuleServiceImpl implements SysAclModuleService {
    @Resource
    private SysAclModuleDao sysAclModuleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysAclModule queryById(Integer id) {
        return this.sysAclModuleDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SysAclModule> queryAllByLimit(int offset, int limit) {
        return this.sysAclModuleDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param sysAclModule 实例对象
     * @return 实例对象
     */
    @Override
    public SysAclModule insert(SysAclModule sysAclModule) {
        this.sysAclModuleDao.insert(sysAclModule);
        return sysAclModule;
    }

    /**
     * 修改数据
     *
     * @param sysAclModule 实例对象
     * @return 实例对象
     */
    @Override
    public SysAclModule update(SysAclModule sysAclModule) {
        this.sysAclModuleDao.update(sysAclModule);
        return this.queryById(sysAclModule.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.sysAclModuleDao.deleteById(id) > 0;
    }
}