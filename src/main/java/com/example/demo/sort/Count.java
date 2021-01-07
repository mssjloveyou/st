package com.example.demo.sort;

public class Count extends TestSort{
    @Override
    public void sort(Integer[] values) {
        int val=values[0];
        for(int i=0;i<values.length;i++){
            val=Math.max(val,values[i]);
        }
        countSort(values,val);
    }
    public void countSort(Integer[] values, int maxValue){

        int[] count = new int[maxValue+1];
        // fill count num
        for(int v : values){
            count[v]++;
        }
        // change count
        for(int i =1;i<count.length;i++){
            count[i]+=count[i-1];
        }
        int[] result = new int[values.length];
        for (int j=values.length-1; j>=0; j--) {
            result[count[values[j]]-1] = values[j];
            count[values[j]]--;
        }
        System.out.println();


    }


}
