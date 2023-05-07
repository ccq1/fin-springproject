package com.dfrt.dao;

import com.dfrt.bean.Member;

import java.sql.SQLException;
import java.util.List;

//DAO data access object 数据访问对象 其实操作底层的数据存储 大多数时候是关系型数据库
public interface MemberDAO {

    void add(Member member);
    void delete(int id);
    void update(Member member);
    List<Member> list();
    Member load(int id);

}
