package com.home;

import javax.jws.soap.SOAPBinding;

public class MyQueque implements MyQueques {
    String[]Users=new String[10];
    @Override
    public String userElement() {
        Users[0]="Vasya";
        Users[1]="Petya";
        Users[2]="Sasha";
        return null;
    }

    @Override
    public String removeUser() {
        return null;
    }

    @Override
    public boolean offerUser(Object User) {
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
