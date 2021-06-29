package com.ruoyi.project.agc.agcMonthCheck.controller;

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
import com.ruoyi.project.agc.agcMonthCheck.domain.MdAgcCheck;
import com.ruoyi.project.agc.agcMonthCheck.service.IMdAgcCheckService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * AGC月考核Controller
 * 
 * @author ruoyi
 * @date 2021-06-17
 */
@Controller
@RequestMapping("/agc/agcMonthCheck")
public class MdAgcCheckController extends BaseController
{
    private String prefix = "agc/agcMonthCheck";

    @Autowired
    private IMdAgcCheckService mdAgcCheckService;

    @RequiresPermissions("agc:agcMonthCheck:view")
    @GetMapping()
    public String agcMonthCheck()
    {
        return prefix + "/agcMonthCheck";
    }

    /**
     * 查询AGC月考核列表
     */
    @RequiresPermissions("agc:agcMonthCheck:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MdAgcCheck mdAgcCheck)
    {
        startPage();
        List<MdAgcCheck> list = mdAgcCheckService.selectMdAgcCheckList(mdAgcCheck);
        return getDataTable(list);
    }

    /**
     * 导出AGC月考核列表
     */
    @RequiresPermissions("agc:agcMonthCheck:export")
    @Log(title = "AGC月考核", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(MdAgcCheck mdAgcCheck)
    {
        List<MdAgcCheck> list = mdAgcCheckService.selectMdAgcCheckList(mdAgcCheck);
        ExcelUtil<MdAgcCheck> util = new ExcelUtil<MdAgcCheck>(MdAgcCheck.class);
        return util.exportExcel(list, "AGC月考核数据");
    }

    /**
     * 新增AGC月考核
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存AGC月考核
     */
    @RequiresPermissions("agc:agcMonthCheck:add")
    @Log(title = "AGC月考核", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(MdAgcCheck mdAgcCheck)
    {
        return toAjax(mdAgcCheckService.insertMdAgcCheck(mdAgcCheck));
    }

    /**
     * 修改AGC月考核
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        MdAgcCheck mdAgcCheck = mdAgcCheckService.selectMdAgcCheckById(id);
        mmap.put("mdAgcCheck", mdAgcCheck);
        return prefix + "/edit";
    }

    /**
     * 修改保存AGC月考核
     */
    @RequiresPermissions("agc:agcMonthCheck:edit")
    @Log(title = "AGC月考核", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(MdAgcCheck mdAgcCheck)
    {
        return toAjax(mdAgcCheckService.updateMdAgcCheck(mdAgcCheck));
    }

    /**
     * 删除AGC月考核
     */
    @RequiresPermissions("agc:agcMonthCheck:remove")
    @Log(title = "AGC月考核", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(mdAgcCheckService.deleteMdAgcCheckByIds(ids));
    }
}
