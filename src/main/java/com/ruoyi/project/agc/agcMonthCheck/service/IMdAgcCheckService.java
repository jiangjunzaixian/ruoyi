package com.ruoyi.project.agc.agcMonthCheck.service;

import java.util.List;
import com.ruoyi.project.agc.agcMonthCheck.domain.MdAgcCheck;

/**
 * AGC月考核Service接口
 * 
 * @author ruoyi
 * @date 2021-06-17
 */
public interface IMdAgcCheckService 
{
    /**
     * 查询AGC月考核
     * 
     * @param id AGC月考核ID
     * @return AGC月考核
     */
    public MdAgcCheck selectMdAgcCheckById(Long id);

    /**
     * 查询AGC月考核列表
     * 
     * @param mdAgcCheck AGC月考核
     * @return AGC月考核集合
     */
    public List<MdAgcCheck> selectMdAgcCheckList(MdAgcCheck mdAgcCheck);

    /**
     * 新增AGC月考核
     * 
     * @param mdAgcCheck AGC月考核
     * @return 结果
     */
    public int insertMdAgcCheck(MdAgcCheck mdAgcCheck);

    /**
     * 修改AGC月考核
     * 
     * @param mdAgcCheck AGC月考核
     * @return 结果
     */
    public int updateMdAgcCheck(MdAgcCheck mdAgcCheck);

    /**
     * 批量删除AGC月考核
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteMdAgcCheckByIds(String ids);

    /**
     * 删除AGC月考核信息
     * 
     * @param id AGC月考核ID
     * @return 结果
     */
    public int deleteMdAgcCheckById(Long id);
}
