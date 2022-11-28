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
@TableName("memorandum")
@ApiModel(value = "MemorandumEntity对象", description = "")
public class MemorandumEntity {

    @TableId(value = "MemorandumId", type = IdType.AUTO)
    private Integer memorandumId;

    @TableField("p_id")
    private Integer pId;

    @TableField("bTime")
    private String bTime;

    @TableField("project")
    private String project;

    @TableField("place")
    private String place;

    @TableField("addtime")
    private LocalDate addtime;


}
