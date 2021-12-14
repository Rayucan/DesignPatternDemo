package com.rayucan.designparttern.StructuralPatterns.ProxyPattern;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/8 22:24
 * 
 * 代理模式
 * 
 * 就是封装一个已有接口，并返回相同类型
 * 在调用接口前后可以增加某些功能
 * 如权限管理、延迟加载、连接池复用等
 * 
 * 这里实现的是数据库连接延迟关闭
 */
public class Main {
    public static void main(String[] args) {
        String jdbcUrl = "jdbcUrlTest";
        String jdbcUsername = "root";
        String jdbcPassword = "root";

        DataSource lazyDataSource = new LazyDataSource(jdbcUrl, jdbcUsername, jdbcPassword);
        System.out.println("get lazy connection");
        
        try (Connection conn1 = lazyDataSource.getConnection()){
            //do nothing
        } catch (Exception throwables) {
            throwables.printStackTrace();
        }

        System.out.println("get lazy connection");
        
        try (Connection conn2 = lazyDataSource.getConnection()){
            try (PreparedStatement ps = conn2.prepareStatement("select * from Students")){
                try (ResultSet rs = ps.executeQuery()){
                    while (rs.next()){
                        System.out.println(rs.getString("name"));
                    }
                }
            }
        } catch (Exception throwables) {
            throwables.printStackTrace();
        }
    }
}
