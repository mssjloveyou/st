package com.example.demo.sort;

public class Shell extends TestSort{
    @Override
    public void sort(Integer[] values) {
        for(int gap=values.length/2;gap>0;gap=gap/2){
            for(int j=gap;j< values.length;j++){
                int tmpValue = values[j];
                while(j-gap>=0 && values[j-gap]>tmpValue){
                    values[j]=values[j-gap];
                    j=j-gap;
                }
                values[j]=tmpValue;
            }
        }
    }
}
