package com.home;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MainTest implements MyQueques {
    private int dim;
    String[]data=new String[dim];
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void main() {
        add("Hello");
        remove("Hello");


    }

    @Override
    public boolean add(String  nullElem) {
        String[]data1=new String[data.length+1];
        for (int i = 0; i < data1.length - 1; i++){
            data1[i < dim ? i : i + 1] = data[i];}
        data1[dim]= java.lang.String.valueOf(add("nullElem"));
        return true;
    }

    @Override
    public boolean remove(String laselement) {
        String[]data2=new String[data.length-1];
        for (int i = 0; i < data2.length - 1; i++){
            data2[i < dim ? i : i + 1] = data[i];}
        data2[dim]= java.lang.String.valueOf(remove("laselement"));
        return true;

    }
    @Override
    public void calculatedim(){
        if (add("nullElem")==true){
            dim+=1;
        }
        if(remove("laselement")==true){
            dim-=1;
        }

    }
}