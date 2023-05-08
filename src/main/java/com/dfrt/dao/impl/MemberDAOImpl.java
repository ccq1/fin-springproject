package com.dfrt.dao.impl;

import com.dfrt.bean.Member;
import com.dfrt.dao.MemberDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// JDBC java database connection java访问数据库 一套规范 API
public class MemberDAOImpl implements MemberDAO {

    public void add(Member member) {

    }

    public void delete(int id) {

    }

    public void update(Member member) {

    }

    public List<Member> list() {

        List<Member> members = new ArrayList<Member>();

        try{
            //1 加载驱动

            Class.forName("com.mysql.jdbc.Driver");

            //2 用驱动管理器创建连接
            String url = "jdbc:mysql://localhost:3306/db_shop_0506?useSSL=false";
            String username = "root";
            String password = "1234";

            Connection conn = DriverManager.getConnection(url, username, password);

            //3 用连接创建执行sql的工具

            Statement stat = conn.createStatement();

            //4 执行sql 拿到返回 根据执行的是写操作还是读操作 返回的类型不同 针对处理即可

            String sql = "select id , member_name , email from t_member";

            ResultSet rs = stat.executeQuery(sql);

            while(rs.next()) //结果集中的游标 指向结果集中的下一条记录
            {
                System.out.println(rs.getInt("id") + " " + rs.getString("member_name"));
            }
            //5 关闭打开的资源 先打开的后关闭
            rs.close();
            stat.close();
            conn.close();
        }catch (Exception e)
        {
            e.printStackTrace(); // 这里的打印不可以隐藏 千万不要注释！！！ 可以用log打印到文件
        }

        return members;
    }

    public Member load(int id) {

        Member member = null;

        try{
            //1 加载驱动

            Class.forName("com.mysql.jdbc.Driver");

            //2 用驱动管理器创建连接
            String url = "jdbc:mysql://localhost:3306/db_shop_0506?useSSL=false";
            String username = "root";
            String password = "1234";

            Connection conn = DriverManager.getConnection(url, username, password);

            //3 用连接创建执行sql的工具

            Statement stat = conn.createStatement();

            //4 执行sql 拿到返回 根据执行的是写操作还是读操作 返回的类型不同 针对处理即可

            String sql = "select id , member_name , email from t_member where id="+id;

            ResultSet rs = stat.executeQuery(sql);

            if(rs.next()) // 根据id最多查到一条记录
            {
                member = new Member();
                member.setId(rs.getInt("id"));
                member.setMemberName(rs.getString("member_name"));
                member.setEmail(rs.getString("email"));
            }
            //5 关闭打开的资源 先打开的后关闭
            rs.close();
            stat.close();
            conn.close();
        }catch (Exception e)
        {
            e.printStackTrace(); // 这里的打印不可以隐藏 千万不要注释！！！ 可以用log打印到文件
        }

        return member;
    }
}
