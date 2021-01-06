package com.example.demo.sort;

public class Quick extends TestSort{
    @Override
    public void sort(Integer[] values) {

        quickSort(values,0,values.length-1);


    }

    public void quickSort(Integer[] values,int min,int max){
        if(min>max){
            return;
        }
        int  mid = parten(values,min,max);
        quickSort(values,min,mid-1);
        quickSort(values,mid+1,max);
    }
    public int parten(Integer[] values,int min,int max){
        int i=min;
        int posValue = values[i];
        while(min<max){
            while(max>min&&values[max]>=posValue){
                max--;
            }
            while(max>min&&values[min]<=posValue){
                min++;
            }
            if(min<max){
                int tmpValue = values[max];
                values[max]=values[min];
                values[min]=tmpValue;
            }
        }
        values[i]=values[min];
        values[min]=posValue;
        return min;
    }

}
