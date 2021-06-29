package com.ruoyi.project.agc.agcAdJust.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.agc.agcAdJust.mapper.MdAgcAdjustMapper;
import com.ruoyi.project.agc.agcAdJust.domain.MdAgcAdjust;
import com.ruoyi.project.agc.agcAdJust.service.IMdAgcAdjustService;
import com.ruoyi.common.utils.text.Convert;

/**
 * AGC单次考核Service业务层处理
 * 
 * @author mx
 * @date 2021-06-16
 */
@Service
public class MdAgcAdjustServiceImpl implements IMdAgcAdjustService 
{
    @Autowired
    private MdAgcAdjustMapper mdAgcAdjustMapper;

    /**
     * 查询AGC单次考核
     * 
     * @param id AGC单次考核ID
     * @return AGC单次考核
     */
    @Override
    public MdAgcAdjust selectMdAgcAdjustById(Long id)
    {
        return mdAgcAdjustMapper.selectMdAgcAdjustById(id);
    }

    /**
     * 查询AGC单次考核列表
     * 
     * @param mdAgcAdjust AGC单次考核
     * @return AGC单次考核
     */
    @Override
    public List<MdAgcAdjust> selectMdAgcAdjustList(MdAgcAdjust mdAgcAdjust)
    {
        return mdAgcAdjustMapper.selectMdAgcAdjustList(mdAgcAdjust);
    }

    /**
     * 新增AGC单次考核
     * 
     * @param mdAgcAdjust AGC单次考核
     * @return 结果
     */
    @Override
    public int insertMdAgcAdjust(MdAgcAdjust mdAgcAdjust)
    {
        return mdAgcAdjustMapper.insertMdAgcAdjust(mdAgcAdjust);
    }

    /**
     * 修改AGC单次考核
     * 
     * @param mdAgcAdjust AGC单次考核
     * @return 结果
     */
    @Override
    public int updateMdAgcAdjust(MdAgcAdjust mdAgcAdjust)
    {
        return mdAgcAdjustMapper.updateMdAgcAdjust(mdAgcAdjust);
    }

    /**
     * 删除AGC单次考核对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteMdAgcAdjustByIds(String ids)
    {
        return mdAgcAdjustMapper.deleteMdAgcAdjustByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除AGC单次考核信息
     * 
     * @param id AGC单次考核ID
     * @return 结果
     */
    @Override
    public int deleteMdAgcAdjustById(Long id)
    {
        return mdAgcAdjustMapper.deleteMdAgcAdjustById(id);
    }
}
