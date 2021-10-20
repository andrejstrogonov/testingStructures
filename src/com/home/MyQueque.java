package com.home;

public class MyQueque implements MyQueques {
    public int id;
    public String name;
    public int age;
    public void User(String name, int age, int id){
        this.age=age;
        this.name=name;
        this.id=id;
    }
    @Override
    public String userElement() {
        return null;
    }

    @Override
    public String removeUser() {
        return null;
    }

    @Override
    public boolean offerUser(Object user) {
        return false;
    }

    @Override
    public String peekUser() {
        return null;
    }

    @Override
    public String pollUser() {
        return null;
    }
}
