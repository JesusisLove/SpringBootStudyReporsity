package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.TUser;

import java.util.List;

@Mapper
public interface TUserMapper {
	public List<TUser> queryUserList();
}
