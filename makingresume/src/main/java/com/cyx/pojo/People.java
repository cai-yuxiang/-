package com.cyx.pojo;

public class People {
    private int peopleID;
    private String peopleName;
    private int peopleAge;
    private String peopleSchool;
    private String peopleSex;

    public People(int peopleID, String peopleName, int peopleAge, String peopleSchool, String peopleSex) {
        this.peopleID = peopleID;
        this.peopleName = peopleName;
        this.peopleAge = peopleAge;
        this.peopleSchool = peopleSchool;
        this.peopleSex = peopleSex;
    }

    public People() {
    }

    public int getPeopleID() {
        return peopleID;
    }

    public void setPeopleID(int peopleID) {
        this.peopleID = peopleID;
    }

    public String getPeopleName() {
        return peopleName;
    }

    public void setPeopleName(String peopleName) {
        this.peopleName = peopleName;
    }

    public int getPeopleAge() {
        return peopleAge;
    }

    public void setPeopleAge(int peopleAge) {
        this.peopleAge = peopleAge;
    }

    public String getPeopleSchool() {
        return peopleSchool;
    }

    public void setPeopleSchool(String peopleSchool) {
        this.peopleSchool = peopleSchool;
    }

    public String getPeopleSex() {
        return peopleSex;
    }

    public void setPeopleSex(String peopleSex) {
        this.peopleSex = peopleSex;
    }
}
