package com.example.demo.jvm;


/**
 * -Xms10m -Xmx20m
 */

public class TestJVM2 {

    public static void main(String[] args) throws InterruptedException {
            long time = System.currentTimeMillis();
            for(int i=0;i<1000000000;i++){
                TestJVM2 t = new TestJVM2();
            }
        System.out.println(System.currentTimeMillis()-time);
            Thread.sleep(1000000);
    }

}
