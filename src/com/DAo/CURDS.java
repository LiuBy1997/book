package com.DAo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.Beans.Book;


public class CURDS {
    public static List<Book> select() {
        String sql = "select * from book";
        List<Book> list = query(sql);
        System.out.println(list.size());
        return list;
    }
    public static List<Book> findPage(int page,int num){
        String sql="select * from book limit ?,?";
        return query(sql,page,num);
    }
    public static List<Integer> count(){
        String sql ="select count(*) from league";
        return query(sql);
    }
    public static void insert(Book book) {
        // double dis=Double.parseDouble( book.getDiscount());
        String dis = book.getDiscount();
        double discount = 0;
        if ("全折".equals(dis)) {
            discount = 1.0;
        } else if ("九折".equals(dis)) {
            discount = 0.9;
        } else if ("八折".equals(dis)) {
            discount = 0.8;
        } else if ("七折".equals(dis)) {
            discount = 0.7;
        } else if ("六折".equals(dis)) {
            discount = 0.6;
        }
        String sql = "insert into book values (null,?,?,?,?,?,?,?)";
        update(sql, book.getName(), book.getType(), book.getAuthor(), discount, book.getPrice(),
                book.getNum(), book.getTest());
    }

    private static void update(String sql, Object... params) {
        PreparedStatement ps = null;
        Connection conn = JDBCUtils.getConnection();
        try {
            ps = conn.prepareStatement(sql);
            for (int i = 0; i < params.length; i++) {
                ps.setObject((i + 1), params[i]);
            }
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                JDBCUtils.close(ps, conn, null);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @SuppressWarnings("unchecked")
    private static <T>  List<T> query(String sql,Object... params){
        List<T> list = new ArrayList<T>();
        Connection conn =JDBCUtils.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
                ps = conn.prepareStatement(sql);
                for (int i = 0; i < params.length; i++) {
                        ps.setObject((i+1), params[i]);
                }
                rs = ps.executeQuery();
               if(rs.next()){
                   list.add(rs.getInt(1), null);
               }
        }catch(

    Exception e)
    {
        System.out.println(e);
    }finally
    {
        try {
            JDBCUtils.close(ps, conn, rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }return list;
}
    
private static void books(){
//    while(rs.next()){
//        list.add(new Book(
//                rs.getInt(1),
//                rs.getString(2),
//                rs.getString(3),
//                rs.getString(4),
//                rs.getString(5),
//                rs.getDouble(6),
//                rs.getInt(7),
//                rs.getString(8)
//                ));
    }
}







