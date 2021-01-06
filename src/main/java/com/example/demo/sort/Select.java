package com.example.demo.sort;

public class Select extends TestSort{
    @Override
    public void sort(Integer[] values) {
        for (int i = 0; i < values.length; i++) {
            int tmp=i;
            int tmepV= values[i];
            for(int j=i+1;j<values.length;j++){
                if(values[tmp]>values[j]){
                    tmp=j;
                }
                count++;
            }
            values[i]=values[tmp];
            values[tmp]=tmepV;
        }
    }
}
