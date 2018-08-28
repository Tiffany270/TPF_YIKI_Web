package com.tpf.Entity;

public class OrderDetail {
    private Integer did;

    private Integer gid;

    private String gname;

    private Integer dnumber;

    private String oid;

    public OrderDetail(Integer did, Integer gid, String gname, Integer dnumber, String oid) {
        this.did = did;
        this.gid = gid;
        this.gname = gname;
        this.dnumber = dnumber;
        this.oid = oid;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
         "did=" + did +
         ", gid=" + gid +
         ", gname='" + gname + '\'' +
         ", dnumber=" + dnumber +
         ", oid='" + oid + '\'' +
         '}';
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname == null ? null : gname.trim();
    }

    public Integer getDnumber() {
        return dnumber;
    }

    public void setDnumber(Integer dnumber) {
        this.dnumber = dnumber;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid == null ? null : oid.trim();
    }
}