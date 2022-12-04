package com.example.demo.mapper;

import com.example.demo.entity.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author way
 * @since 2022-11-30 15:06:31
 */
@Mapper

public interface UserMapper extends BaseMapper<UserEntity> {

}
