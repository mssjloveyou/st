package com.example.demo.sort;

import java.util.Arrays;

public abstract class TestSort {
    public int count =0;
    public void test(){
        Integer[] values = Values.sortValues;
        print(values);
        sort(values);
        System.out.println("sort count:"+count);
        print(values);
    }
    public abstract void sort(Integer[] values);

    public void print(Integer[] sort){
        System.out.println(Arrays.asList(sort));
    }
}
