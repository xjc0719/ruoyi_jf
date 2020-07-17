package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysCustomerMapper;
import com.ruoyi.system.domain.SysCustomer;
import com.ruoyi.system.service.ISysCustomerService;
import com.ruoyi.common.core.text.Convert;

/**
 * 客户Service业务层处理
 *
 * @author ruoyi
 * @date 2020-07-13
 */
@Service
public class SysCustomerServiceImpl implements ISysCustomerService
{
    @Autowired
    private SysCustomerMapper sysCustomerMapper;

    /**
     * 查询客户
     *
     * @param customerId 客户ID
     * @return 客户
     */
    @Override
    public SysCustomer selectSysCustomerById(Long customerId)
    {
        return sysCustomerMapper.selectSysCustomerById(customerId);
    }

    /**
     * 查询客户列表
     *
     * @param sysCustomer 客户
     * @return 客户
     */
    @Override
    public List<SysCustomer> selectSysCustomerList(SysCustomer sysCustomer)
    {
        return sysCustomerMapper.selectSysCustomerList(sysCustomer);
    }

    /**
     * 新增客户
     *
     * @param sysCustomer 客户
     * @return 结果
     */
    @Override
    public int insertSysCustomer(SysCustomer sysCustomer)
    {
        return sysCustomerMapper.insertSysCustomer(sysCustomer);
    }

    /**
     * 修改客户
     *
     * @param sysCustomer 客户
     * @return 结果
     */
    @Override
    public int updateSysCustomer(SysCustomer sysCustomer)
    {
        return sysCustomerMapper.updateSysCustomer(sysCustomer);
    }

    /**
     * 删除客户对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSysCustomerByIds(String ids)
    {
        return sysCustomerMapper.deleteSysCustomerByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除客户信息
     *
     * @param customerId 客户ID
     * @return 结果
     */
    @Override
    public int deleteSysCustomerById(Long customerId)
    {
        return sysCustomerMapper.deleteSysCustomerById(customerId);
    }
}
