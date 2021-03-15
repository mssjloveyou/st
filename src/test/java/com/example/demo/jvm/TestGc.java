package com.example.demo.jvm;


import java.util.ArrayList;
import java.util.List;

/**
 * -Xms10m -Xmx10m
 */

public class TestGc {

    public static void main(String[] args) throws InterruptedException {
        List<String> list  = new ArrayList<>();
        String v = "adsfasdf";
        while(true){
            v+=v;
            list.add(v);
        }


    }

}
