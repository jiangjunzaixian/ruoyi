package com.ruoyi.project.agc.agcMonthCheck.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * AGC月考核对象 md_agc_check
 * 
 * @author ruoyi
 * @date 2021-06-17
 */
public class MdAgcCheck extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /** 时间 */
    @Excel(name = "时间")
    private String time;

    /** 场站 */
    @Excel(name = "场站")
    private String standName;

    /** 可用率 */
    @Excel(name = "可用率")
    private BigDecimal availability;

    /** 速率 */
    @Excel(name = "速率")
    private BigDecimal speed;

    /** 合格率 */
    @Excel(name = "合格率")
    private BigDecimal qualified;

    /** 响应时间 */
    @Excel(name = "响应时间")
    private BigDecimal responseTime;

    /** 可用率考核分 */
    @Excel(name = "可用率考核分")
    private BigDecimal availabilityScore;

    /** 速率考核分 */
    @Excel(name = "速率考核分")
    private BigDecimal speedScore;

    /** 合格率考核分 */
    @Excel(name = "合格率考核分")
    private BigDecimal qualifiedScore;

    /** 响应时间考核分 */
    @Excel(name = "响应时间考核分")
    private BigDecimal responseTimeScore;

    /** 考核总分 */
    @Excel(name = "考核总分")
    private BigDecimal sumScore;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setTime(String time)
    {
        this.time = time;
    }

    public String getTime()
    {
        return time;
    }
    public void setStandName(String standName)
    {
        this.standName = standName;
    }

    public String getStandName()
    {
        return standName;
    }
    public void setAvailability(BigDecimal availability)
    {
        this.availability = availability;
    }

    public BigDecimal getAvailability()
    {
        return availability;
    }
    public void setSpeed(BigDecimal speed)
    {
        this.speed = speed;
    }

    public BigDecimal getSpeed()
    {
        return speed;
    }
    public void setQualified(BigDecimal qualified)
    {
        this.qualified = qualified;
    }

    public BigDecimal getQualified()
    {
        return qualified;
    }
    public void setResponseTime(BigDecimal responseTime)
    {
        this.responseTime = responseTime;
    }

    public BigDecimal getResponseTime()
    {
        return responseTime;
    }
    public void setAvailabilityScore(BigDecimal availabilityScore)
    {
        this.availabilityScore = availabilityScore;
    }

    public BigDecimal getAvailabilityScore()
    {
        return availabilityScore;
    }
    public void setSpeedScore(BigDecimal speedScore)
    {
        this.speedScore = speedScore;
    }

    public BigDecimal getSpeedScore()
    {
        return speedScore;
    }
    public void setQualifiedScore(BigDecimal qualifiedScore)
    {
        this.qualifiedScore = qualifiedScore;
    }

    public BigDecimal getQualifiedScore()
    {
        return qualifiedScore;
    }
    public void setResponseTimeScore(BigDecimal responseTimeScore)
    {
        this.responseTimeScore = responseTimeScore;
    }

    public BigDecimal getResponseTimeScore()
    {
        return responseTimeScore;
    }
    public void setSumScore(BigDecimal sumScore)
    {
        this.sumScore = sumScore;
    }

    public BigDecimal getSumScore()
    {
        return sumScore;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("time", getTime())
            .append("standName", getStandName())
            .append("availability", getAvailability())
            .append("speed", getSpeed())
            .append("qualified", getQualified())
            .append("responseTime", getResponseTime())
            .append("availabilityScore", getAvailabilityScore())
            .append("speedScore", getSpeedScore())
            .append("qualifiedScore", getQualifiedScore())
            .append("responseTimeScore", getResponseTimeScore())
            .append("sumScore", getSumScore())
            .toString();
    }
}
