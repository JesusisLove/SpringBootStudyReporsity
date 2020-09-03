package com.liu.springboot04web.mapper;

import com.liu.springboot04web.bean.Department ;
import org.apache.ibatis.annotations.*;

import java.util.List;

/* DepartmentMapper是采用@Mapper注解的方式访问数据库 */

//@Mapper // 该注解告诉MyBatis，DepartmentMapper是一个操作数据库的Mapper，扫描该interface并装配到容器中
public interface DepartmentMapper {

    @Select("select * from `bezal_department` where `dep_id`=${depId}")
    public Department getDeptById(Integer id);

    @Select("select * from `bezal_department`")
    public List<Department> getDeptAll( );
    //keyProperty = "dep_id" 执行插入操作后抛异常👈原来这个keyProperty不是值数据库表字段名称，乃是Bean的属性名称啊！！！⭐️️️️2020/08/19
    @Options(useGeneratedKeys = true,keyProperty = "depId") /* useGeneratedKeys = true:指定是否使用数字自动自增(自动采番)的主键； 这个解释是错误的👉keyProperty = "id"：告诉框架，指定主键的这个字段名是哪个 👈 */
    @Insert("insert into `bezal_department`(`department_name`) values('${departmentName}')")
    public int insertDept(Department dept);

    @Update("update `bezal_department` set `department_name`='${departmentName}' where `dep_id`=${depId}")
    public int updateDept(Department dept);

    @Delete("delete from `bezal_department` where `dep_id`=${depId}")
    public int deleteDeptById(Integer id);

}
