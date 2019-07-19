package com.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.web.bean.User;

@Mapper
public interface UserMapper {
    @Select("SELECT ID,userName,PASSWORD,AGE FROM USER")
	List<User> findAll();
    
    @Delete("DELETE FROM USER WHERE ID=#{id}")
	int delect(int id);
    @Select("select ID,userName,PASSWORD,AGE  from user where id=#{id}")
	User select(int id);
    @Update("UPDATE USER SET USERNAME=#{userName}, PASSWORD=#{password}, AGE=#{age} WHERE ID=#{id}")
	void update(User user);
    
    @Insert("insert into user(userName,password,age) values(#{userName},#{password},#{age})")
	int addUser(User user);
}