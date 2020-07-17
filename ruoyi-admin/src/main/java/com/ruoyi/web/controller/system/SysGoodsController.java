package com.ruoyi.web.controller.system;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.SysGoods;
import com.ruoyi.system.service.ISysGoodsService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 商品Controller
 *
 * @author ruoyi
 * @date 2020-07-13
 */
@Controller
@RequestMapping("/system/goods")
public class SysGoodsController extends BaseController
{
    private String prefix = "system/goods";

    @Autowired
    private ISysGoodsService sysGoodsService;

    @RequiresPermissions("system:goods:view")
    @GetMapping()
    public String goods()
    {
        return prefix + "/goods";
    }

    /**
     * 查询商品列表
     */
    @RequiresPermissions("system:goods:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SysGoods sysGoods)
    {
        startPage();
        List<SysGoods> list = sysGoodsService.selectSysGoodsList(sysGoods);
        return getDataTable(list);
    }

    /**
     * 导出商品列表
     */
    @RequiresPermissions("system:goods:export")
    @Log(title = "商品", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SysGoods sysGoods)
    {
        List<SysGoods> list = sysGoodsService.selectSysGoodsList(sysGoods);
        ExcelUtil<SysGoods> util = new ExcelUtil<SysGoods>(SysGoods.class);
        return util.exportExcel(list, "goods");
    }

    /**
     * 新增商品
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存商品
     */
    @RequiresPermissions("system:goods:add")
    @Log(title = "商品", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SysGoods sysGoods)
    {
        return toAjax(sysGoodsService.insertSysGoods(sysGoods));
    }

    /**
     * 修改商品
     */
    @GetMapping("/edit/{goodsId}")
    public String edit(@PathVariable("goodsId") Long goodsId, ModelMap mmap)
    {
        SysGoods sysGoods = sysGoodsService.selectSysGoodsById(goodsId);
        mmap.put("sysGoods", sysGoods);
        return prefix + "/edit";
    }

    /**
     * 修改保存商品
     */
    @RequiresPermissions("system:goods:edit")
    @Log(title = "商品", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SysGoods sysGoods)
    {
        return toAjax(sysGoodsService.updateSysGoods(sysGoods));
    }

    /**
     * 删除商品
     */
    @RequiresPermissions("system:goods:remove")
    @Log(title = "商品", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(sysGoodsService.deleteSysGoodsByIds(ids));
    }
}
