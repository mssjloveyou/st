package com.example.demo.sort;

import java.util.Arrays;

public class Redix extends TestSort{
    @Override
    public void sort(Integer[] values) {

//        for(int exp = 1; 9/exp > 0; exp *= 10){

            countingSort(values);

//        }
    }
    private static void countingSort(Integer[] arr){
        int max=0;
        for(int v : arr){
            max=Math.max(max,v);
        }
        for(int gap=1;gap<max;gap*=10){
            int[] bucket = new int[10];
            for(int i=0;i<arr.length;i++){
                bucket[arr[i]/gap%10]++;
            }
            for(int i=1;i<bucket.length;i++){
                bucket[i]+=bucket[i-1];
            }
            int[] tmp = new int[arr.length];
            for(int i=arr.length-1;i>=0;i--){
                tmp[bucket[arr[i]/gap%10]-1]=arr[i];
                bucket[arr[i]/gap%10]--;
            }
            for(int i=0;i<arr.length;i++){
                arr[i]=tmp[i];
            }
        }

    }

}
