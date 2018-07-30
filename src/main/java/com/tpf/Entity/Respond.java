package com.tpf.Entity;

import java.util.HashMap;
import java.util.Map;

public class Respond {
 //通用JSON应答

 private int code;//状态码 100-成功 200-失败
 private String msg;//提示信息

 //用户要返回给浏览器的数据
 private Map<String, Object> data = new HashMap<String, Object>();

 public static Respond success(){
  Respond result = new Respond();
  result.setCode(100);
  result.setMsg("成功");
  return  result;


 }

 public static Respond fail(){
  Respond result = new Respond();
  result.setCode(200);
  result.setMsg("失败！");
  return  result;
 }

 public Respond add(String key,Object value){
  this.data.put(key,value);
  return  this;
 }

 public int getCode() {
  return code;
 }

 public void setCode(int code) {
  this.code = code;
 }

 public String getMsg() {
  return msg;
 }

 public void setMsg(String msg) {
  this.msg = msg;
 }

 public Map<String, Object> getData() {
  return data;
 }

 public void setData(Map<String, Object> data) {
  this.data = data;
 }
}
