package com.c4.dao;


import com.c4.entity.User;

import com.github.abel533.mapper.Mapper;

public interface UserDao extends Mapper<User>{

//	@Select("select * from tb_user where username = #{name}")
//	public User findUserByUsername(@Param("name")String name);

//	@Select("select * from tb_user where id = #{id}")
//	public User selectByPrimaryKey(@Param("id")Long id);
}

