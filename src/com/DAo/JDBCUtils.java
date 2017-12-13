package com.DAo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;

public class JDBCUtils {	
        public static Connection getConnection(){
            Properties pr=new Properties();
            DataSource druid =null;
            Connection conn=null;
            try {
                pr.load(new  FileInputStream(JDBCUtils.class.getResource("/").getPath()+"druid.properties"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
               druid =DruidDataSourceFactory.createDataSource(pr);
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                conn=druid.getConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return conn;
        }
	public static void close(Statement stm,Connection conn,ResultSet rs) throws SQLException{
		if(stm != null)
			stm.close();
		if(conn != null)
			conn.close();
		if(rs != null)
			rs.close();
	}
}
