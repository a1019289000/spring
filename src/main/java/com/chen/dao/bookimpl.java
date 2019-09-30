package com.chen.dao;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface bookimpl {
    @Select("select * from book where name=#{name}")
    public book getbook(String name);
}
