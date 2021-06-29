package com.ruoyi.project.agc.agcInfo.mapper;

import java.util.List;
import com.ruoyi.project.agc.agcInfo.domain.MdActualPowerData;

/**
 * AGC信息Mapper接口
 * 
 * @author mx
 * @date 2021-06-16
 */
public interface MdActualPowerDataMapper 
{
    /**
     * 查询AGC信息
     * 
     * @param id AGC信息ID
     * @return AGC信息
     */
    public MdActualPowerData selectMdActualPowerDataById(Long id);

    /**
     * 查询AGC信息列表
     * 
     * @param mdActualPowerData AGC信息
     * @return AGC信息集合
     */
    public List<MdActualPowerData> selectMdActualPowerDataList(MdActualPowerData mdActualPowerData);

    /**
     * 新增AGC信息
     * 
     * @param mdActualPowerData AGC信息
     * @return 结果
     */
    public int insertMdActualPowerData(MdActualPowerData mdActualPowerData);

    /**
     * 修改AGC信息
     * 
     * @param mdActualPowerData AGC信息
     * @return 结果
     */
    public int updateMdActualPowerData(MdActualPowerData mdActualPowerData);

    /**
     * 删除AGC信息
     * 
     * @param id AGC信息ID
     * @return 结果
     */
    public int deleteMdActualPowerDataById(Long id);

    /**
     * 批量删除AGC信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteMdActualPowerDataByIds(String[] ids);
}
