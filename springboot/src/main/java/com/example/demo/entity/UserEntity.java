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
@TableName("user")
@ApiModel(value = "UserEntity对象", description = "")
public class UserEntity {

    @TableId(value = "p_id", type = IdType.AUTO)
    private Integer pId;

    @TableField("p_name")
    private String pName;

    @TableField("p_sex")
    private String pSex;

    @TableField("p_bir")
    private LocalDate pBir;

    @TableField("p_tel")
    private String pTel;

    @TableField("u_age")
    private Integer uAge;

    @TableField("u_QQ")
    private String uQq;

    @TableField("u_Job")
    private String uJob;

    @TableField("u_Place")
    private String uPlace;

    @TableField("`password`")
    private String password;


}
