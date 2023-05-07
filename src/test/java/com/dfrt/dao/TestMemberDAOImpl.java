package com.dfrt.dao;

import com.dfrt.bean.Member;
import com.dfrt.dao.impl.MemberDAOImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class TestMemberDAOImpl {

    MemberDAO memberDAO = null;

    @Before
    public void init(){
        memberDAO = new MemberDAOImpl();

    }


    @Test
    public void testList(){


        List<Member> members = memberDAO.list();

        for(Member member : members)
        {
            System.out.println(member);
        }

    }

    @Test
    public void testLoad(){


        Member member = memberDAO.load(2);
        System.out.println(member);

    }

    @After
    public void destroy(){
        memberDAO = null;

    }



}
