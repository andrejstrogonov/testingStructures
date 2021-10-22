package com.home;

public class MyQueque implements MyQueques {
    public String[]users;
    public int maxSize;
    public int nElem;
    public int front;
    public int rear;

    public MyQueque(int maxSize){
        this.maxSize=maxSize;
        users=new String[maxSize];
        rear=-1;
        front=0;
        nElem=0;
    }
    @Override
    public String userElement() {
        return users[front];
    }
    @Override
    public String removeUser() {
        String temp=users[front++];
        if(front==maxSize){
            front=0;
        }
        nElem--;
        return temp;
    }
    @Override
    public boolean offerUser(String elem) {
        if(rear ==maxSize-1){
            rear=-1;
        }
        users[++rear]=elem;
        return true;
    }
    @Override
    public String peekUser(String elem) {
        return users[front];
    }
    @Override
    public String pollUser() {
        String temp=users[front++];
        if(front==maxSize){
            front=0;
        }
        nElem--;
        return users[front];
    }
}