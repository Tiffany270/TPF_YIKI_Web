package com.tpf.Entity;

public class Orderlist {
    private Integer oid;

    private String oname;

    private String oprice;

    private String onumber;

    private String osize;

    private String oaddress;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname == null ? null : oname.trim();
    }

    public String getOprice() {
        return oprice;
    }

    public void setOprice(String oprice) {
        this.oprice = oprice == null ? null : oprice.trim();
    }

    public String getOnumber() {
        return onumber;
    }

    public void setOnumber(String onumber) {
        this.onumber = onumber == null ? null : onumber.trim();
    }

    public String getOsize() {
        return osize;
    }

    public void setOsize(String osize) {
        this.osize = osize == null ? null : osize.trim();
    }

    public String getOaddress() {
        return oaddress;
    }

    public void setOaddress(String oaddress) {
        this.oaddress = oaddress == null ? null : oaddress.trim();
    }
}