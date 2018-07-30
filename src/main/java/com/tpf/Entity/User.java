package com.tpf.Entity;

public class User {
    private Integer uid;

    private String uname;

    private String urealname;

    private String upassword;

    private String uaddress;

    private String uphone;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getUrealname() {
        return urealname;
    }

    public void setUrealname(String urealname) {
        this.urealname = urealname == null ? null : urealname.trim();
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword == null ? null : upassword.trim();
    }

    public String getUaddress() {
        return uaddress;
    }

    public void setUaddress(String uaddress) {
        this.uaddress = uaddress == null ? null : uaddress.trim();
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone == null ? null : uphone.trim();
    }

    @Override
    public String toString() {
        return "User{" +
         "uid=" + uid +
         ", uname='" + uname + '\'' +
         ", urealname='" + urealname + '\'' +
         ", upassword='" + upassword + '\'' +
         ", uaddress='" + uaddress + '\'' +
         ", uphone='" + uphone + '\'' +
         '}';
    }

    public User(String uname, String urealname, String upassword, String uaddress, String uphone) {
        this.uname = uname;
        this.urealname = urealname;
        this.upassword = upassword;
        this.uaddress = uaddress;
        this.uphone = uphone;
    }

    public User(Integer uid, String uname, String urealname, String upassword, String uaddress, String uphone) {
        this.uid = uid;
        this.uname = uname;
        this.urealname = urealname;
        this.upassword = upassword;
        this.uaddress = uaddress;
        this.uphone = uphone;
    }

    public User() {
    }
}