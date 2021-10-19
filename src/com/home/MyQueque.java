package com.home;

public class MyQueque implements MyQueques {
    private int dim;
    String[]data=new String[dim];
    @Override
    public boolean add(String nullElem) {
        String[]data1=new String[data.length+1];
        for (int i = 0; i < data1.length - 1; i++){
            data1[i < dim ? i : i + 1] = data[i];}
        data1[dim]= java.lang.String.valueOf(add("nullElem"));
        return true;
    }

    @Override
    public boolean remove(String laselement) {
        String[]data2=new String[data.length-1];
        for (int i = 0; i < data2.length; i++){
            data2[i < dim ? i : i + 1] = data[i];}
        data2[dim]= java.lang.String.valueOf(remove("laselement"));
        return false;
    }
    @Override
    public  void calculatedim(){
        if (add("nullElem")==true){
            dim+=1;
        }
        if(remove("laselement")==true){
            dim-=1;
        }

    }
}
