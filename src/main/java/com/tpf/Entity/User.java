package com.tpf.Entity;

import java.io.Serializable;

public class User implements Serializable {

 private int uid;
 private String uname;
 private String urealname;
 private String upassword;
 private String uaddress;
 private String uphone;

 public User() {
 }

 public User(int uid, String uname, String urealname, String upassword, String uaddress, String uphone) {
  this.uid = uid;
  this.uname = uname;
  this.urealname = urealname;
  this.upassword = upassword;
  this.uaddress = uaddress;
  this.uphone = uphone;
 }

 public User(String uname, String urealname, String upassword, String uaddress, String uphone) {
  this.uname = uname;
  this.urealname = urealname;
  this.upassword = upassword;
  this.uaddress = uaddress;
  this.uphone = uphone;
 }

 public int getUid() {
  return uid;
 }

 public void setUid(int uid) {
  this.uid = uid;
 }

 public String getUname() {
  return uname;
 }

 public void setUname(String uname) {
  this.uname = uname;
 }

 public String getUrealname() {
  return urealname;
 }

 public void setUrealname(String urealname) {
  this.urealname = urealname;
 }

 public String getUpassword() {
  return upassword;
 }

 public void setUpassword(String upassword) {
  this.upassword = upassword;
 }

 public String getUaddress() {
  return uaddress;
 }

 public void setUaddress(String uaddress) {
  this.uaddress = uaddress;
 }

 public String getUphone() {
  return uphone;
 }

 public void setUphone(String uphone) {
  this.uphone = uphone;
 }
}
