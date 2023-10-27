package com.example.mapper;

import com.example.entity.Admin;
import com.example.entity.Params;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface AdminMapper extends Mapper<Admin> {

    //     1. 基于注解的方式
//    @Select("select * from admin")
    List<Admin> findBySearch(@Param("params") Params params);

    @Select("select * from admin where name = #{name} limit 1")
    Admin findByName(@Param("name") String name);
}
