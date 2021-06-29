package com.ruoyi.project.agc.agcInfo.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * AGC信息对象 md_actual_power_data
 * 
 * @author mx
 * @date 2021-06-16
 */
public class MdActualPowerData extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /** 场站编号 */
    @Excel(name = "场站编号")
    private String number;

    /** 场站名称 */
    @Excel(name = "场站名称")
    private String numberName;

    /** 时间 */
    @Excel(name = "时间")
    private String time;

    /** 实际功率 */
    @Excel(name = "实际功率")
    private BigDecimal value;

    /** 下发指令 */
    @Excel(name = "下发指令")
    private BigDecimal instructions;

    /** agc投退状态 */
    @Excel(name = "agc投退状态")
    private Long agcState;

    /** 限电状态 */
    @Excel(name = "限电状态")
    private Long powerState;

    /** 排序 */
    @Excel(name = "排序")
    private Long sort;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setNumber(String number)
    {
        this.number = number;
    }

    public String getNumber()
    {
        return number;
    }
    public void setNumberName(String numberName)
    {
        this.numberName = numberName;
    }

    public String getNumberName()
    {
        return numberName;
    }
    public void setTime(String time)
    {
        this.time = time;
    }

    public String getTime()
    {
        return time;
    }
    public void setValue(BigDecimal value)
    {
        this.value = value;
    }

    public BigDecimal getValue()
    {
        return value;
    }
    public void setInstructions(BigDecimal instructions)
    {
        this.instructions = instructions;
    }

    public BigDecimal getInstructions()
    {
        return instructions;
    }
    public void setAgcState(Long agcState)
    {
        this.agcState = agcState;
    }

    public Long getAgcState()
    {
        return agcState;
    }
    public void setPowerState(Long powerState)
    {
        this.powerState = powerState;
    }

    public Long getPowerState()
    {
        return powerState;
    }
    public void setSort(Long sort)
    {
        this.sort = sort;
    }

    public Long getSort()
    {
        return sort;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("number", getNumber())
            .append("numberName", getNumberName())
            .append("time", getTime())
            .append("value", getValue())
            .append("instructions", getInstructions())
            .append("agcState", getAgcState())
            .append("powerState", getPowerState())
            .append("sort", getSort())
            .toString();
    }
}
