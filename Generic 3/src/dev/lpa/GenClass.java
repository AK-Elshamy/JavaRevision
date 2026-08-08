package dev.lpa;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class GenClass <T>{
    private List<T> list = new ArrayList<>();
    public void add(T t){
        list.add(t);
    }
    public void print(){
        for(T t : list){
            System.out.print(t + " ");
        }
    }
}
