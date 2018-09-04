package com.hyg.yucai.model;

public class TDetail {
    private Integer detailid;

    private String detailcontent;

    private String detailprice;

    private String detailpeople;

    private String detaileffect;

    private Integer courseid;

    private String standbyField01;

    private String standbyField02;

    public Integer getDetailid() {
        return detailid;
    }

    public void setDetailid(Integer detailid) {
        this.detailid = detailid;
    }

    public String getDetailcontent() {
        return detailcontent;
    }

    public void setDetailcontent(String detailcontent) {
        this.detailcontent = detailcontent == null ? null : detailcontent.trim();
    }

    public String getDetailprice() {
        return detailprice;
    }

    public void setDetailprice(String detailprice) {
        this.detailprice = detailprice == null ? null : detailprice.trim();
    }

    public String getDetailpeople() {
        return detailpeople;
    }

    public void setDetailpeople(String detailpeople) {
        this.detailpeople = detailpeople == null ? null : detailpeople.trim();
    }

    public String getDetaileffect() {
        return detaileffect;
    }

    public void setDetaileffect(String detaileffect) {
        this.detaileffect = detaileffect == null ? null : detaileffect.trim();
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public String getStandbyField01() {
        return standbyField01;
    }

    public void setStandbyField01(String standbyField01) {
        this.standbyField01 = standbyField01 == null ? null : standbyField01.trim();
    }

    public String getStandbyField02() {
        return standbyField02;
    }

    public void setStandbyField02(String standbyField02) {
        this.standbyField02 = standbyField02 == null ? null : standbyField02.trim();
    }
}