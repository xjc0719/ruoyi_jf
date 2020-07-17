package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysGoodsMapper;
import com.ruoyi.system.domain.SysGoods;
import com.ruoyi.system.service.ISysGoodsService;
import com.ruoyi.common.core.text.Convert;

/**
 * 商品Service业务层处理
 *
 * @author ruoyi
 * @date 2020-07-13
 */
@Service
public class SysGoodsServiceImpl implements ISysGoodsService
{
    @Autowired
    private SysGoodsMapper sysGoodsMapper;

    /**
     * 查询商品
     *
     * @param goodsId 商品ID
     * @return 商品
     */
    @Override
    public SysGoods selectSysGoodsById(Long goodsId)
    {
        return sysGoodsMapper.selectSysGoodsById(goodsId);
    }

    /**
     * 查询商品列表
     *
     * @param sysGoods 商品
     * @return 商品
     */
    @Override
    public List<SysGoods> selectSysGoodsList(SysGoods sysGoods)
    {
        return sysGoodsMapper.selectSysGoodsList(sysGoods);
    }

    /**
     * 新增商品
     *
     * @param sysGoods 商品
     * @return 结果
     */
    @Override
    public int insertSysGoods(SysGoods sysGoods)
    {
        return sysGoodsMapper.insertSysGoods(sysGoods);
    }

    /**
     * 修改商品
     *
     * @param sysGoods 商品
     * @return 结果
     */
    @Override
    public int updateSysGoods(SysGoods sysGoods)
    {
        return sysGoodsMapper.updateSysGoods(sysGoods);
    }

    /**
     * 删除商品对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSysGoodsByIds(String ids)
    {
        return sysGoodsMapper.deleteSysGoodsByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除商品信息
     *
     * @param goodsId 商品ID
     * @return 结果
     */
    @Override
    public int deleteSysGoodsById(Long goodsId)
    {
        return sysGoodsMapper.deleteSysGoodsById(goodsId);
    }
}

