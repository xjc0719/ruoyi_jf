package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysProgrammeMapper;
import com.ruoyi.system.domain.SysProgramme;
import com.ruoyi.system.service.ISysProgrammeService;
import com.ruoyi.common.core.text.Convert;

/**
 * 方案Service业务层处理
 *
 * @author ruoyi
 * @date 2020-07-13
 */
@Service
public class SysProgrammeServiceImpl implements ISysProgrammeService
{
    @Autowired
    private SysProgrammeMapper sysProgrammeMapper;

    /**
     * 查询方案
     *
     * @param programmeId 方案ID
     * @return 方案
     */
    @Override
    public SysProgramme selectSysProgrammeById(Long programmeId)
    {
        return sysProgrammeMapper.selectSysProgrammeById(programmeId);
    }

    /**
     * 查询方案列表
     *
     * @param sysProgramme 方案
     * @return 方案
     */
    @Override
    public List<SysProgramme> selectSysProgrammeList(SysProgramme sysProgramme)
    {
        return sysProgrammeMapper.selectSysProgrammeList(sysProgramme);
    }

    /**
     * 新增方案
     *
     * @param sysProgramme 方案
     * @return 结果
     */
    @Override
    public int insertSysProgramme(SysProgramme sysProgramme)
    {
        return sysProgrammeMapper.insertSysProgramme(sysProgramme);
    }

    /**
     * 修改方案
     *
     * @param sysProgramme 方案
     * @return 结果
     */
    @Override
    public int updateSysProgramme(SysProgramme sysProgramme)
    {
        return sysProgrammeMapper.updateSysProgramme(sysProgramme);
    }

    /**
     * 删除方案对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSysProgrammeByIds(String ids)
    {
        return sysProgrammeMapper.deleteSysProgrammeByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除方案信息
     *
     * @param programmeId 方案ID
     * @return 结果
     */
    @Override
    public int deleteSysProgrammeById(Long programmeId)
    {
        return sysProgrammeMapper.deleteSysProgrammeById(programmeId);
    }
}
