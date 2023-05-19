package com.example.realtor.model;

public enum Role {
    ADMIN, USER, OWNER;

    public String getAuthority(){
        return name();
    }
}
