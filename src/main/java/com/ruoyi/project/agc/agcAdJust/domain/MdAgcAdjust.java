package com.ruoyi.project.agc.agcAdJust.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * AGC单次考核对象 md_agc_adjust
 * 
 * @author mx
 * @date 2021-06-16
 */
public class MdAgcAdjust extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /** 场站名称 */
    @Excel(name = "场站名称")
    private String standName;

    /** 指令下发时间 */
    @Excel(name = "指令下发时间")
    private String startTime;

    /** 响应结束时间 */
    @Excel(name = "响应结束时间")
    private String endTime;

    /** 开始功率 */
    @Excel(name = "开始功率")
    private BigDecimal startValue;

    /** 结束功率 */
    @Excel(name = "结束功率")
    private BigDecimal endValue;

    /** 下发指令值 */
    @Excel(name = "下发指令值")
    private BigDecimal orderValue;

    /** 响应时刻 */
    @Excel(name = "响应时刻")
    private String respTime;

    /** 响应时刻功率 */
    @Excel(name = "响应时刻功率")
    private BigDecimal respValue;

    /** 响应时间 */
    @Excel(name = "响应时间")
    private BigDecimal respTimeValue;

    /** 调节时间 */
    @Excel(name = "调节时间")
    private BigDecimal adjustTime;

    /** 调节量 */
    @Excel(name = "调节量")
    private BigDecimal agcQua;

    /** 调节速率 */
    @Excel(name = "调节速率")
    private BigDecimal avgRate;

    /** 考核分 */
    @Excel(name = "考核分")
    private BigDecimal checkScore;

    /** 考核原因 */
    @Excel(name = "考核原因")
    private String checkReason;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setStandName(String standName)
    {
        this.standName = standName;
    }

    public String getStandName()
    {
        return standName;
    }
    public void setStartTime(String startTime)
    {
        this.startTime = startTime;
    }

    public String getStartTime()
    {
        return startTime;
    }
    public void setEndTime(String endTime)
    {
        this.endTime = endTime;
    }

    public String getEndTime()
    {
        return endTime;
    }
    public void setStartValue(BigDecimal startValue)
    {
        this.startValue = startValue;
    }

    public BigDecimal getStartValue()
    {
        return startValue;
    }
    public void setEndValue(BigDecimal endValue)
    {
        this.endValue = endValue;
    }

    public BigDecimal getEndValue()
    {
        return endValue;
    }
    public void setOrderValue(BigDecimal orderValue)
    {
        this.orderValue = orderValue;
    }

    public BigDecimal getOrderValue()
    {
        return orderValue;
    }
    public void setRespTime(String respTime)
    {
        this.respTime = respTime;
    }

    public String getRespTime()
    {
        return respTime;
    }
    public void setRespValue(BigDecimal respValue)
    {
        this.respValue = respValue;
    }

    public BigDecimal getRespValue()
    {
        return respValue;
    }
    public void setRespTimeValue(BigDecimal respTimeValue)
    {
        this.respTimeValue = respTimeValue;
    }

    public BigDecimal getRespTimeValue()
    {
        return respTimeValue;
    }
    public void setAdjustTime(BigDecimal adjustTime)
    {
        this.adjustTime = adjustTime;
    }

    public BigDecimal getAdjustTime()
    {
        return adjustTime;
    }
    public void setAgcQua(BigDecimal agcQua)
    {
        this.agcQua = agcQua;
    }

    public BigDecimal getAgcQua()
    {
        return agcQua;
    }
    public void setAvgRate(BigDecimal avgRate)
    {
        this.avgRate = avgRate;
    }

    public BigDecimal getAvgRate()
    {
        return avgRate;
    }
    public void setCheckScore(BigDecimal checkScore)
    {
        this.checkScore = checkScore;
    }

    public BigDecimal getCheckScore()
    {
        return checkScore;
    }
    public void setCheckReason(String checkReason)
    {
        this.checkReason = checkReason;
    }

    public String getCheckReason()
    {
        return checkReason;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("standName", getStandName())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .append("startValue", getStartValue())
            .append("endValue", getEndValue())
            .append("orderValue", getOrderValue())
            .append("respTime", getRespTime())
            .append("respValue", getRespValue())
            .append("respTimeValue", getRespTimeValue())
            .append("adjustTime", getAdjustTime())
            .append("agcQua", getAgcQua())
            .append("avgRate", getAvgRate())
            .append("checkScore", getCheckScore())
            .append("checkReason", getCheckReason())
            .toString();
    }
}
