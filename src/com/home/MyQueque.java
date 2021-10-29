package com.home;

import java.util.LinkedList;
import java.util.List;

public class MyQueque<T> implements ArmQueque<T> {
    private final List<T> queue;
    public static final int START = 0;

    public MyQueque() {
        queue = new LinkedList<>();
    }

    @Override
    public void push(T e) {
        if (e != null && e != "") {
            queue.add(e);
        }
    }

    @Override
    public T pull() throws MyException {
        if (queue.isEmpty()) {
            throw new MyException();
        } else {
            T result = queue.get(START);
            queue.remove(START);
            return result;
        }
    }

    @Override
    public int getSize() {
        return queue.size();
    }
}
