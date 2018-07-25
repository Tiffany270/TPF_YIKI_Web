package com.tpf.Entity;

public class User {

 private Integer u_id;
 private String u_name;
 private String u_realname;
 private String u_password;
 private String u_address;
 private String u_phone;

 public User() {
 }

 public User(String u_name, String u_realname, String u_password, String u_address, String u_phone) {
  this.u_name = u_name;
  this.u_realname = u_realname;
  this.u_password = u_password;
  this.u_address = u_address;
  this.u_phone = u_phone;
 }

 public Integer getU_id() {
  return u_id;
 }

 public void setU_id(Integer u_id) {
  this.u_id = u_id;
 }

 public String getU_name() {
  return u_name;
 }

 public void setU_name(String u_name) {
  this.u_name = u_name;
 }

 public String getU_realname() {
  return u_realname;
 }

 public void setU_realname(String u_realname) {
  this.u_realname = u_realname;
 }

 public String getU_password() {
  return u_password;
 }

 public void setU_password(String u_password) {
  this.u_password = u_password;
 }

 public String getU_address() {
  return u_address;
 }

 public void setU_address(String u_address) {
  this.u_address = u_address;
 }

 public String getU_phone() {
  return u_phone;
 }

 public void setU_phone(String u_phone) {
  this.u_phone = u_phone;
 }

 @Override
 public String toString() {
  return "User{" +
   "u_id=" + u_id +
   ", u_name='" + u_name + '\'' +
   ", u_realname='" + u_realname + '\'' +
   ", u_password='" + u_password + '\'' +
   ", u_address='" + u_address + '\'' +
   ", u_phone='" + u_phone + '\'' +
   '}';
 }
}
