package com.example.demo.controller;

import com.example.demo.common.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author way
 * @since 2022-11-30 15:06:31
 */
@RestController
@RequestMapping("/user-entity")
public class UserController {

    @PostMapping
     public Result save(@org.apache.ibatis.annotations.Result ) {

     };

}
