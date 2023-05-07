package com.dfrt.bean;

public class Member {

    private Integer id;
    private String memberName;
    private String email;

    public Member() {
    }

    public Member(String memberName, String email) {
        this.memberName = memberName;
        this.email = email;
    }

    public Member(Integer id, String memberName, String email) {
        this.id = id;
        this.memberName = memberName;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", memberName='" + memberName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
