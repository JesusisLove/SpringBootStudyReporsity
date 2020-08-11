package com.liu.springboot06datamybatis.mapper;

import com.liu.springboot06datamybatis.bean.Department;
import org.apache.ibatis.annotations.*;

/* DepartmentMapper是采用@Mapper注解的方式访问数据库 */

@Mapper // 该注解告诉MyBatis，DepartmentMapper是一个操作数据库的Mapper，扫描该interface并装配到容器中
public interface DepartmentMapper {

    @Select("select * from `department` where `‘id’`=${id}")
    public Department getDeptById(Integer id);

    @Delete("delete from `department` where `‘id’`=${id}")
    public int deleteDeptById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id") /* useGeneratedKeys = true:指定是否使用数字自动自增(自动采番)的主键； keyProperty = "id"：告诉框架，指定主键的这个字段名是哪个 */
    @Insert("insert into `department`(`‘department_name’`) values(#{departmentName})")
    public int insertDept(Department dept);

    @Update("update `department` set `‘department_name’`=#{departmentName} where `‘id’`=#{id}")
    public int updateDept(Department dept);
}
