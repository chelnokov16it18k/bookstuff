package com.chelnokov.shelf.model;

public enum Permission {
    BOOKS_READ("books:read");

    private final String permission;

    Permission(String permission){
        this.permission = permission;
    }

    public String getPermission(){
        return permission;
    }

}
