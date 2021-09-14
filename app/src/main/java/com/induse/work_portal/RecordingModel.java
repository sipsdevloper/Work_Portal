package com.induse.work_portal;

public class RecordingModel {
    String id;
    String orgid;
    String title;
    String regnumber;
    String vihicalnumber;

    String original_price;
    String sport;
    String coach;
    String eventdate;
    String eventtime;


    String image;
    String delete;
    String Total_Quiz;



    public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }


    public String getTotal_Quiz() {
        return Total_Quiz;
    }

    public void setTotal_Quiz(String Total_Quiz) {
        this.Total_Quiz= Total_Quiz;
    }




    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid;
    }

    public void settitle(String title) {
        this.title= title;
    }
    public String gettitle() {
        return title;
    }

    public String getimage() {
        return image;
    }

    public void setimage(String image) {
        this.image= image;
    }


    public String getSport() {
        return sport;
    }

    public void setsport(String sport) {
        this.sport = sport;
    }
    public String getcoach() {
        return coach;
    }

    public void setcoach(String coach) {
        this.coach = coach;
    }

    public String geteventdate() {
        return eventdate;
    }

    public void seteventdate(String eventdate) {
        this.eventdate = eventdate;
    }

    public String geteventtime() {
        return eventtime;
    }

    public void seteventtime(String eventtime) {
        this.eventtime = eventtime;
    }

    public String getdelete() {
        return delete;
    }

    public void setdelete(String delete) {
        this.delete= delete;
    }


    public String getRegnumber() {
        return regnumber;
    }

    public void setRegnumber(String regnumber) {
        this.regnumber = regnumber;
    }





}

