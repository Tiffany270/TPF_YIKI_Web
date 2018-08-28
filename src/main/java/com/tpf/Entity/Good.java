package com.tpf.Entity;

public class Good {
    private Integer gid;

    private String gname;

    private Integer gprice;

    private Integer gnumber;

    private String gsize;

    private String gpicture;

    private String gdiscuss;

    private String gtype;

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

    public Integer getGprice() {
        return gprice;
    }

    public void setGprice(Integer gprice) {
        this.gprice = gprice;
    }

    public Integer getGnumber() {
        return gnumber;
    }

    public void setGnumber(Integer gnumber) {
        this.gnumber = gnumber;
    }

    public String getGsize() {
        return gsize;
    }

    public void setGsize(String gsize) {
        this.gsize = gsize == null ? null : gsize.trim();
    }

    public String getGpicture() {
        return gpicture;
    }

    public void setGpicture(String gpicture) {
        this.gpicture = gpicture == null ? null : gpicture.trim();
    }

    public String getGdiscuss() {
        return gdiscuss;
    }

    public void setGdiscuss(String gdiscuss) {
        this.gdiscuss = gdiscuss == null ? null : gdiscuss.trim();
    }

    public String getGtype() {
        return gtype;
    }

    public void setGtype(String gtype) {
        this.gtype = gtype == null ? null : gtype.trim();
    }

    @Override
    public String toString() {
        return "Good{" +
         "gid=" + gid +
         ", gname='" + gname + '\'' +
         ", gprice=" + gprice +
         ", gnumber=" + gnumber +
         ", gsize='" + gsize + '\'' +
         ", gpicture='" + gpicture + '\'' +
         ", gdiscuss='" + gdiscuss + '\'' +
         ", gtype='" + gtype + '\'' +
         '}';
    }



    @Override
    public int hashCode() {// 重新定义对hashmap内存储对象判断是否重复的方法

        return this.getGid() + this.getGname().hashCode();// 如4+名字的哈希码32=36
        // 哈希表的存储规则就改变了
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {// 判断是否等于自身
            return true;
        }
        if (obj instanceof Good) {// 判断 Items 是否为obj类型的对象

            Good i = (Good) obj;// 比较Items类中你自定义的数据域，id和name
            if (this.getGid() == i.getGid() && this.getGname().equals(i.getGname())) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
        // 这样每当new一个item对象，如果是id和名字相同，就默认是同一个对象。
    }


}