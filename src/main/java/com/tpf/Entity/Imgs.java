package com.tpf.Entity;

public class Imgs {

 private int iid;
 private String iurl;

 @Override
 public String toString() {
  return "Imgs{" +
   "iid=" + iid +
   ", iurl='" + iurl + '\'' +
   '}';
 }

 public Imgs() {
 }

 public int getIid() {
  return iid;
 }

 public void setIid(int iid) {
  this.iid = iid;
 }

 public String getIurl() {
  return iurl;
 }

 public void setIurl(String iurl) {
  this.iurl = iurl;
 }

 public Imgs(int iid, String iurl) {
  this.iid = iid;
  this.iurl = iurl;
 }
}
