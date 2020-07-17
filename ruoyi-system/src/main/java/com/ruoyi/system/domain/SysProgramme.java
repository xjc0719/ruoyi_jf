package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 方案对象 sys_programme
 *
 * @author ruoyi
 * @date 2020-07-13
 */
public class SysProgramme extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 方案id */
    private Long programmeId;

    /** 客户id */
    @Excel(name = "客户id")
    private Long customerId;

    /** 肥胖程度 */
    @Excel(name = "肥胖程度")
    private Long degree;

    /** 减肥效果 */
    @Excel(name = "减肥效果")
    private Long effect;

    /** 年龄 */
    @Excel(name = "年龄")
    private Long age;

    /** 方案种类 */
    @Excel(name = "方案种类")
    private String type;

    public void setProgrammeId(Long programmeId)
    {
        this.programmeId = programmeId;
    }

    public Long getProgrammeId()
    {
        return programmeId;
    }
    public void setCustomerId(Long customerId)
    {
        this.customerId = customerId;
    }

    public Long getCustomerId()
    {
        return customerId;
    }
    public void setDegree(Long degree)
    {
        this.degree = degree;
    }

    public Long getDegree()
    {
        return degree;
    }
    public void setEffect(Long effect)
    {
        this.effect = effect;
    }

    public Long getEffect()
    {
        return effect;
    }
    public void setAge(Long age)
    {
        this.age = age;
    }

    public Long getAge()
    {
        return age;
    }
    public void setType(String type)
    {
        this.type = type;
    }

    public String getType()
    {
        return type;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("programmeId", getProgrammeId())
                .append("customerId", getCustomerId())
                .append("degree", getDegree())
                .append("effect", getEffect())
                .append("age", getAge())
                .append("type", getType())
                .toString();
    }
}
