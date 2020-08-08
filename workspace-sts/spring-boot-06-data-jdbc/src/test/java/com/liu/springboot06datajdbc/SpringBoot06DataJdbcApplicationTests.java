package com.liu.springboot06datajdbc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@SpringBootTest
class SpringBoot06DataJdbcApplicationTests {

    @Autowired
    DataSource dataSource;
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Test
    void contextLoads() throws SQLException {

//        List<Map<String,Object>> list = jdbcTemplate.queryForList("select * from t_user");
//        Map<String,Object> map = list.get(0);
        // 从控制台看一下是什么数据源
//        System.out.println("dataSource.getClass()=======" + dataSource.getClass());
//
//        Connection connection =  dataSource.getConnection();
//        System.out.println("dconnection=======" + connection);
//        connection.close();
    }

}
