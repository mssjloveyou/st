package com.example.demo.sort;

public class Insert extends TestSort{
    @Override
    public void sort(Integer[] values) {

        for(int i =1;i<values.length;i++){
            int tempValue = values[i];
            int j = i;
            while(j-1>=0 && values[j-1]>tempValue){
                values[j]=values[j-1];
                j--;
            }
            values[j]=tempValue;
        }


    }
}
