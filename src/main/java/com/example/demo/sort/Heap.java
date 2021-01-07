package com.example.demo.sort;

public class Heap extends TestSort{
    @Override
    public void sort(Integer[] data) {
        buildMaxHeap(data);
        for(int i =data.length;i>0;i--){
            int tempValue = data[0];
            data[0]=data[i-1];
            data[i-1]=tempValue;
            heap(data,0,i-1);
        }
    }

    private void buildMaxHeap(Integer[] data) {
        for(int i=data.length/2;i>=0;i--){
            heap(data,i,data.length);
        }
    }

    private void heap(Integer[] data, int parent,int deep) {

        int leftIndex = parent * 2 + 1;
        int rightIndex = parent * 2 + 2;

        int maxIndex = parent;

        if(leftIndex < deep && data[leftIndex]>data[parent]){
            maxIndex = leftIndex;
        }
        if(rightIndex < deep && data[rightIndex]>data[maxIndex]){
            maxIndex = rightIndex;
        }

        if(maxIndex != parent){
            int tempV = data[maxIndex];
            data[maxIndex]=data[parent];
            data[parent]=tempV;
            heap(data,maxIndex,deep);
        }

    }


}
