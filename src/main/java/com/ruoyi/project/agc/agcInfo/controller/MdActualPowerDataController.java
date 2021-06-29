package com.ruoyi.project.agc.agcInfo.controller;

import java.util.ArrayList;
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
import com.ruoyi.project.agc.agcInfo.domain.MdActualPowerData;
import com.ruoyi.project.agc.agcInfo.service.IMdActualPowerDataService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * AGC信息Controller
 * 
 * @author mx
 * @date 2021-06-16
 */
@Controller
@RequestMapping("/agc/agcInfo")
public class MdActualPowerDataController extends BaseController
{
    private String prefix = "agc/agcInfo";

    @Autowired
    private IMdActualPowerDataService mdActualPowerDataService;

    @RequiresPermissions("agc:agcInfo:view")
    @GetMapping()
    public String agcInfo()
    {
        return prefix + "/agcInfo";
    }

    /**
     * 查询AGC信息列表
     */
    @RequiresPermissions("agc:agcInfo:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MdActualPowerData mdActualPowerData)
    {
        startPage();
        List<MdActualPowerData> list;
        if((mdActualPowerData.getTime() == null || "".equals(mdActualPowerData.getTime())) &&
           (mdActualPowerData.getNumberName() == null || "".equals(mdActualPowerData.getNumberName()))
        ){
            list = new ArrayList<>();
        }else{
            list = mdActualPowerDataService.selectMdActualPowerDataList(mdActualPowerData);
        }
        return getDataTable(list);
    }
    /**
     * 查询AGC信息列表
     */
    @RequiresPermissions("agc:agcInfo:getEchartsList")
    @PostMapping("/getEchartsList")
    @ResponseBody
    public TableDataInfo getEchartsList(MdActualPowerData mdActualPowerData)
    {
        startPage();
        List<MdActualPowerData> list;
        if((mdActualPowerData.getTime() == null || "".equals(mdActualPowerData.getTime())) && (mdActualPowerData.getNumberName() == null || "".equals(mdActualPowerData.getNumberName()))
        ){
            list = new ArrayList<>();
        }else{
            list = mdActualPowerDataService.selectMdActualPowerDataList(mdActualPowerData);
        }
        return getDataTable(list);
    }
    /**
     * 导出AGC信息列表
     */
    @RequiresPermissions("agc:agcInfo:export")
    @Log(title = "AGC信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(MdActualPowerData mdActualPowerData)
    {
        List<MdActualPowerData> list = mdActualPowerDataService.selectMdActualPowerDataList(mdActualPowerData);
        ExcelUtil<MdActualPowerData> util = new ExcelUtil<MdActualPowerData>(MdActualPowerData.class);
        return util.exportExcel(list, "AGC信息数据");
    }

    /**
     * 新增AGC信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存AGC信息
     */
    @RequiresPermissions("agc:agcInfo:add")
    @Log(title = "AGC信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(MdActualPowerData mdActualPowerData)
    {
        return toAjax(mdActualPowerDataService.insertMdActualPowerData(mdActualPowerData));
    }

    /**
     * 修改AGC信息
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        MdActualPowerData mdActualPowerData = mdActualPowerDataService.selectMdActualPowerDataById(id);
        mmap.put("mdActualPowerData", mdActualPowerData);
        return prefix + "/edit";
    }

    /**
     * 修改保存AGC信息
     */
    @RequiresPermissions("agc:agcInfo:edit")
    @Log(title = "AGC信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(MdActualPowerData mdActualPowerData)
    {
        return toAjax(mdActualPowerDataService.updateMdActualPowerData(mdActualPowerData));
    }

    /**
     * 删除AGC信息
     */
    @RequiresPermissions("agc:agcInfo:remove")
    @Log(title = "AGC信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(mdActualPowerDataService.deleteMdActualPowerDataByIds(ids));
    }
}
