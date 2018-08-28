package com.tpf.Entity;

public class Order {
    private String oid;

    private String ousername;

    private Double ototalprice;

    private String oaddress;

    private String issend;


    public Order(String oid, String ousername, Double ototalprice, String oaddress, String issend) {
        this.oid = oid;
        this.ousername = ousername;
        this.ototalprice = ototalprice;
        this.oaddress = oaddress;
        this.issend = issend;
    }

    @Override
    public String toString() {
        return "Order{" +
         "oid='" + oid + '\'' +
         ", ousername='" + ousername + '\'' +
         ", ototalprice=" + ototalprice +
         ", oaddress='" + oaddress + '\'' +
         ", issend='" + issend + '\'' +
         '}';
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid == null ? null : oid.trim();
    }

    public String getOusername() {
        return ousername;
    }

    public void setOusername(String ousername) {
        this.ousername = ousername == null ? null : ousername.trim();
    }

    public Double getOtotalprice() {
        return ototalprice;
    }

    public void setOtotalprice(Double ototalprice) {
        this.ototalprice = ototalprice;
    }

    public String getOaddress() {
        return oaddress;
    }

    public void setOaddress(String oaddress) {
        this.oaddress = oaddress == null ? null : oaddress.trim();
    }

    public String getIssend() {
        return issend;
    }

    public void setIssend(String issend) {
        this.issend = issend == null ? null : issend.trim();
    }
}