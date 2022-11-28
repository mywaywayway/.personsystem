package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("communication")
@ApiModel(value = "CommunicationEntity对象", description = "")
public class CommunicationEntity {

    @TableId(value = "fId", type = IdType.AUTO)
    private Integer fId;

    @TableField("p_Id")
    private Integer pId;

    @TableField("fName")
    private String fName;

    @TableField("relation")
    private String relation;

    @TableField("place")
    private String place;

    @TableField("tel")
    private String tel;

    @TableField("qq")
    private String qq;


}
