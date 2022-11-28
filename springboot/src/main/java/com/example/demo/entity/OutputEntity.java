package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.time.LocalDate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author way
 * @since 2022-11-30 15:06:31
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("output")
@ApiModel(value = "OutputEntity对象", description = "")
public class OutputEntity {

    @TableId(value = "outPutId", type = IdType.AUTO)
    private Integer outPutId;

    @TableField("p_id")
    private Integer pId;

    @TableField("project")
    private String project;

    @TableField("oMoney")
    private BigDecimal oMoney;

    @TableField("`time`")
    private LocalDate time;

    @TableField("addtime")
    private LocalDate addtime;


}
