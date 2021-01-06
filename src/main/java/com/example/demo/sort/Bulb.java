package com.example.demo.sort;

public class Bulb extends TestSort{


    @Override
    public void sort(Integer[] values) {
        for(int i =0;i<values.length;i++){
            for(int j = i+1;j<values.length;j++){
                if(values[i]<values[j]){
                    values[i]= values[i]+values[j];
                    values[j]= values[i]-values[j];
                    values[i]= values[i]-values[j];
                }
                super.count ++;
            }
        }
    }
}
