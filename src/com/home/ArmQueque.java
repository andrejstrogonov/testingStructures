package com.home;

public interface ArmQueque<T> {
  void push(T e);
  T pull() throws MyException;
  int getSize();
}
