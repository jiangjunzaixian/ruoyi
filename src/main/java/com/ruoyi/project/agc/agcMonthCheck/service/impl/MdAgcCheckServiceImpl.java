package com.ruoyi.project.agc.agcMonthCheck.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.agc.agcMonthCheck.mapper.MdAgcCheckMapper;
import com.ruoyi.project.agc.agcMonthCheck.domain.MdAgcCheck;
import com.ruoyi.project.agc.agcMonthCheck.service.IMdAgcCheckService;
import com.ruoyi.common.utils.text.Convert;

/**
 * AGC月考核Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-06-17
 */
@Service
public class MdAgcCheckServiceImpl implements IMdAgcCheckService 
{
    @Autowired
    private MdAgcCheckMapper mdAgcCheckMapper;

    /**
     * 查询AGC月考核
     * 
     * @param id AGC月考核ID
     * @return AGC月考核
     */
    @Override
    public MdAgcCheck selectMdAgcCheckById(Long id)
    {
        return mdAgcCheckMapper.selectMdAgcCheckById(id);
    }

    /**
     * 查询AGC月考核列表
     * 
     * @param mdAgcCheck AGC月考核
     * @return AGC月考核
     */
    @Override
    public List<MdAgcCheck> selectMdAgcCheckList(MdAgcCheck mdAgcCheck)
    {
        return mdAgcCheckMapper.selectMdAgcCheckList(mdAgcCheck);
    }

    /**
     * 新增AGC月考核
     * 
     * @param mdAgcCheck AGC月考核
     * @return 结果
     */
    @Override
    public int insertMdAgcCheck(MdAgcCheck mdAgcCheck)
    {
        return mdAgcCheckMapper.insertMdAgcCheck(mdAgcCheck);
    }

    /**
     * 修改AGC月考核
     * 
     * @param mdAgcCheck AGC月考核
     * @return 结果
     */
    @Override
    public int updateMdAgcCheck(MdAgcCheck mdAgcCheck)
    {
        return mdAgcCheckMapper.updateMdAgcCheck(mdAgcCheck);
    }

    /**
     * 删除AGC月考核对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteMdAgcCheckByIds(String ids)
    {
        return mdAgcCheckMapper.deleteMdAgcCheckByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除AGC月考核信息
     * 
     * @param id AGC月考核ID
     * @return 结果
     */
    @Override
    public int deleteMdAgcCheckById(Long id)
    {
        return mdAgcCheckMapper.deleteMdAgcCheckById(id);
    }
}
