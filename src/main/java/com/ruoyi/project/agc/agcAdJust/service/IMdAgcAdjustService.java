package com.ruoyi.project.agc.agcAdJust.service;

import java.util.List;
import com.ruoyi.project.agc.agcAdJust.domain.MdAgcAdjust;

/**
 * AGC单次考核Service接口
 * 
 * @author mx
 * @date 2021-06-16
 */
public interface IMdAgcAdjustService 
{
    /**
     * 查询AGC单次考核
     * 
     * @param id AGC单次考核ID
     * @return AGC单次考核
     */
    public MdAgcAdjust selectMdAgcAdjustById(Long id);

    /**
     * 查询AGC单次考核列表
     * 
     * @param mdAgcAdjust AGC单次考核
     * @return AGC单次考核集合
     */
    public List<MdAgcAdjust> selectMdAgcAdjustList(MdAgcAdjust mdAgcAdjust);

    /**
     * 新增AGC单次考核
     * 
     * @param mdAgcAdjust AGC单次考核
     * @return 结果
     */
    public int insertMdAgcAdjust(MdAgcAdjust mdAgcAdjust);

    /**
     * 修改AGC单次考核
     * 
     * @param mdAgcAdjust AGC单次考核
     * @return 结果
     */
    public int updateMdAgcAdjust(MdAgcAdjust mdAgcAdjust);

    /**
     * 批量删除AGC单次考核
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteMdAgcAdjustByIds(String ids);

    /**
     * 删除AGC单次考核信息
     * 
     * @param id AGC单次考核ID
     * @return 结果
     */
    public int deleteMdAgcAdjustById(Long id);
}
