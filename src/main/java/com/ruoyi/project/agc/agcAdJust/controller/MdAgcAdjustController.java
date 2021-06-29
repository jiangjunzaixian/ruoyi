package com.ruoyi.project.agc.agcAdJust.controller;

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
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.agc.agcAdJust.domain.MdAgcAdjust;
import com.ruoyi.project.agc.agcAdJust.service.IMdAgcAdjustService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * AGC单次考核Controller
 * 
 * @author mx
 * @date 2021-06-16
 */
@Controller
@RequestMapping("/agc/agcAdJust")
public class MdAgcAdjustController extends BaseController
{
    private String prefix = "agc/agcAdJust";

    @Autowired
    private IMdAgcAdjustService mdAgcAdjustService;

    @RequiresPermissions("agc:agcAdJust:view")
    @GetMapping()
    public String agcAdJust()
    {
        return prefix + "/agcAdJust";
    }

    /**
     * 查询AGC单次考核列表
     */
    @RequiresPermissions("agc:agcAdJust:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MdAgcAdjust mdAgcAdjust)
    {
        startPage();
        List<MdAgcAdjust> list = mdAgcAdjustService.selectMdAgcAdjustList(mdAgcAdjust);
        return getDataTable(list);
    }

    /**
     * 导出AGC单次考核列表
     */
    @RequiresPermissions("agc:agcAdJust:export")
    @Log(title = "AGC单次考核", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(MdAgcAdjust mdAgcAdjust)
    {
        List<MdAgcAdjust> list = mdAgcAdjustService.selectMdAgcAdjustList(mdAgcAdjust);
        ExcelUtil<MdAgcAdjust> util = new ExcelUtil<MdAgcAdjust>(MdAgcAdjust.class);
        return util.exportExcel(list, "AGC单次考核数据");
    }

    /**
     * 新增AGC单次考核
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存AGC单次考核
     */
    @RequiresPermissions("agc:agcAdJust:add")
    @Log(title = "AGC单次考核", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(MdAgcAdjust mdAgcAdjust)
    {
        return toAjax(mdAgcAdjustService.insertMdAgcAdjust(mdAgcAdjust));
    }

    /**
     * 修改AGC单次考核
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        MdAgcAdjust mdAgcAdjust = mdAgcAdjustService.selectMdAgcAdjustById(id);
        mmap.put("mdAgcAdjust", mdAgcAdjust);
        return prefix + "/edit";
    }

    /**
     * 修改保存AGC单次考核
     */
    @RequiresPermissions("agc:agcAdJust:edit")
    @Log(title = "AGC单次考核", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(MdAgcAdjust mdAgcAdjust)
    {
        return toAjax(mdAgcAdjustService.updateMdAgcAdjust(mdAgcAdjust));
    }

    /**
     * 删除AGC单次考核
     */
    @RequiresPermissions("agc:agcAdJust:remove")
    @Log(title = "AGC单次考核", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(mdAgcAdjustService.deleteMdAgcAdjustByIds(ids));
    }
}
