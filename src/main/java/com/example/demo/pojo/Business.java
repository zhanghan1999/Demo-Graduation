package com.example.demo.pojo;

public class Business {
    private String Businessname;
    private String Businesspassword;
    private Integer business_id;

    public Business() {

    }

    public Business(String Businessname, String Businesspassword) {
        this.Businessname = Businessname;
        this.Businesspassword = Businesspassword;
    }

    public Integer getbusinessId() {
        return business_id;
    }

    public void setbusinessId(Integer business_id) {
        this.business_id = business_id;
    }

    public String getBusinessname() {
        return Businessname;
    }

    public void setBusinessname(String businessname) {
        Businessname = businessname;
    }

    public String getBusinesspassword() {
        return Businesspassword;
    }

    public void setBusinesspassword(String businesspassword) {
        Businesspassword = businesspassword;
    }
}
