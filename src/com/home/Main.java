package com.home;

public class Main {

    public static void main(String[] args) {
        MyQueque users = new MyQueque(5);
        users.offerUser("Vasya");
        users.peekUser("Vasya");
        users.pollUser();
        users.userElement();
        }
}

