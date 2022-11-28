package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("workplane")
@ApiModel(value = "WorkplaneEntity对象", description = "")
public class WorkplaneEntity {

    @TableId(value = "wp_Id", type = IdType.AUTO)
    private Integer wpId;

    @TableField("p_Id")
    private Integer pId;

    @TableField("`time`")
    private LocalDate time;

    @TableField("addtime")
    private LocalDate addtime;

    @TableField("plane")
    private String plane;

    @TableField("place")
    private String place;


}
