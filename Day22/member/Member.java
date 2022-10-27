package com.example.LayerDemo.member;

public class Member {

    private int mID;
    private String name;

    Member(int mID, String name) {
        this.mID = mID;
        this.name = name;
    }

    int getmID() {
        return mID;
    }

    public String getName() {
        return name;
    }
}
