package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysProgramme;

/**
 * 方案Service接口
 *
 * @author ruoyi
 * @date 2020-07-13
 */
public interface ISysProgrammeService
{
    /**
     * 查询方案
     *
     * @param programmeId 方案ID
     * @return 方案
     */
    public SysProgramme selectSysProgrammeById(Long programmeId);

    /**
     * 查询方案列表
     *
     * @param sysProgramme 方案
     * @return 方案集合
     */
    public List<SysProgramme> selectSysProgrammeList(SysProgramme sysProgramme);

    /**
     * 新增方案
     *
     * @param sysProgramme 方案
     * @return 结果
     */
    public int insertSysProgramme(SysProgramme sysProgramme);

    /**
     * 修改方案
     *
     * @param sysProgramme 方案
     * @return 结果
     */
    public int updateSysProgramme(SysProgramme sysProgramme);

    /**
     * 批量删除方案
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSysProgrammeByIds(String ids);

    /**
     * 删除方案信息
     *
     * @param programmeId 方案ID
     * @return 结果
     */
    public int deleteSysProgrammeById(Long programmeId);
}
