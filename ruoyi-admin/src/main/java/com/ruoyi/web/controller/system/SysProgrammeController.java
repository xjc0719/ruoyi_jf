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
import com.ruoyi.system.domain.SysProgramme;
import com.ruoyi.system.service.ISysProgrammeService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 方案Controller
 *
 * @author ruoyi
 * @date 2020-07-13
 */
@Controller
@RequestMapping("/system/programme")
public class SysProgrammeController extends BaseController
{
    private String prefix = "system/programme";

    @Autowired
    private ISysProgrammeService sysProgrammeService;

    @RequiresPermissions("system:programme:view")
    @GetMapping()
    public String programme()
    {
        return prefix + "/programme";
    }

    /**
     * 查询方案列表
     */
    @RequiresPermissions("system:programme:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SysProgramme sysProgramme)
    {
        startPage();
        List<SysProgramme> list = sysProgrammeService.selectSysProgrammeList(sysProgramme);
        return getDataTable(list);
    }

    /**
     * 导出方案列表
     */
    @RequiresPermissions("system:programme:export")
    @Log(title = "方案", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SysProgramme sysProgramme)
    {
        List<SysProgramme> list = sysProgrammeService.selectSysProgrammeList(sysProgramme);
        ExcelUtil<SysProgramme> util = new ExcelUtil<SysProgramme>(SysProgramme.class);
        return util.exportExcel(list, "programme");
    }

    /**
     * 新增方案
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }


    /**
     * 减肥页面新增方案
     */
    @GetMapping("/slimming")
    public String slimming()
    {
        return prefix + "/slimming";
    }

    /**
     * 新增保存方案
     */
    @RequiresPermissions("system:programme:add")
    @Log(title = "方案", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SysProgramme sysProgramme)
    {
        return toAjax(sysProgrammeService.insertSysProgramme(sysProgramme));
    }

    /**
     * 修改方案
     */
    @GetMapping("/edit/{programmeId}")
    public String edit(@PathVariable("programmeId") Long programmeId, ModelMap mmap)
    {
        SysProgramme sysProgramme = sysProgrammeService.selectSysProgrammeById(programmeId);
        mmap.put("sysProgramme", sysProgramme);
        return prefix + "/edit";
    }

    /**
     * 修改保存方案
     */
    @RequiresPermissions("system:programme:edit")
    @Log(title = "方案", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SysProgramme sysProgramme)
    {
        return toAjax(sysProgrammeService.updateSysProgramme(sysProgramme));
    }

    /**
     * 删除方案
     */
    @RequiresPermissions("system:programme:remove")
    @Log(title = "方案", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(sysProgrammeService.deleteSysProgrammeByIds(ids));
    }
}
