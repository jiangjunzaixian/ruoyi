package com.ruoyi.project.agc.agcInfo.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.agc.agcInfo.mapper.MdActualPowerDataMapper;
import com.ruoyi.project.agc.agcInfo.domain.MdActualPowerData;
import com.ruoyi.project.agc.agcInfo.service.IMdActualPowerDataService;
import com.ruoyi.common.utils.text.Convert;

/**
 * AGC信息Service业务层处理
 * 
 * @author mx
 * @date 2021-06-16
 */
@Service
public class MdActualPowerDataServiceImpl implements IMdActualPowerDataService 
{
    @Autowired
    private MdActualPowerDataMapper mdActualPowerDataMapper;

    /**
     * 查询AGC信息
     * 
     * @param id AGC信息ID
     * @return AGC信息
     */
    @Override
    public MdActualPowerData selectMdActualPowerDataById(Long id)
    {
        return mdActualPowerDataMapper.selectMdActualPowerDataById(id);
    }

    /**
     * 查询AGC信息列表
     * 
     * @param mdActualPowerData AGC信息
     * @return AGC信息
     */
    @Override
    public List<MdActualPowerData> selectMdActualPowerDataList(MdActualPowerData mdActualPowerData)
    {
        return mdActualPowerDataMapper.selectMdActualPowerDataList(mdActualPowerData);
    }

    /**
     * 新增AGC信息
     * 
     * @param mdActualPowerData AGC信息
     * @return 结果
     */
    @Override
    public int insertMdActualPowerData(MdActualPowerData mdActualPowerData)
    {
        return mdActualPowerDataMapper.insertMdActualPowerData(mdActualPowerData);
    }

    /**
     * 修改AGC信息
     * 
     * @param mdActualPowerData AGC信息
     * @return 结果
     */
    @Override
    public int updateMdActualPowerData(MdActualPowerData mdActualPowerData)
    {
        return mdActualPowerDataMapper.updateMdActualPowerData(mdActualPowerData);
    }

    /**
     * 删除AGC信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteMdActualPowerDataByIds(String ids)
    {
        return mdActualPowerDataMapper.deleteMdActualPowerDataByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除AGC信息信息
     * 
     * @param id AGC信息ID
     * @return 结果
     */
    @Override
    public int deleteMdActualPowerDataById(Long id)
    {
        return mdActualPowerDataMapper.deleteMdActualPowerDataById(id);
    }
}
