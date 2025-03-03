package com.example.demo.mapper;

import com.example.demo.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
* @author Junlin Chen
* @description 针对表【user(用户表)】的数据库操作Mapper
* @createDate 2025-02-28 17:12:58
* @Entity com.example.demo.domain.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




