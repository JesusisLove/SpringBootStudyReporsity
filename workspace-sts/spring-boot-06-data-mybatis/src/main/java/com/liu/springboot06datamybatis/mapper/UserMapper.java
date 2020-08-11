package com.liu.springboot06datamybatis.mapper;

import com.liu.springboot06datamybatis.bean.Department;
import com.liu.springboot06datamybatis.bean.User;
import org.apache.ibatis.annotations.*;

@Mapper // 该注解告诉MyBatis，DepartmentMapper是一个操作数据库的Mapper
public interface UserMapper {

    @Select("select * from `t_user` where `‘id’`=${id}")
    public User getUserById(Integer id);

    @Select("select * from `t_user`")
    public User getAllUser();

    @Delete("delete from `t_user` where `‘Id’`=${id}")
    public int deleteUserById(Integer id);

    @Insert("insert into `t_user`(`‘username’`,`‘password’`,`‘name’`) values(#{username},#{password},#{name})")
    public int insertUser(User user);

    @Update("update `t_user` set `‘username’`=#{username},`‘password’`=#{password},`‘name’`=#{name} where `‘Id’`=#{id}")
    public int updateUser(User user);
}
