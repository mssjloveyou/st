package com.example.demo.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge extends TestSort{
    @Override
    public void sort(Integer[] values) {
        mergeSort(values,values.length);
    }

    public static void mergeSort(Integer[] a, int n) {
        if(n<2){
            return;
        }
        int mid= a.length/2;
        Integer[] left = new Integer[mid];
        Integer[] right = new Integer[n-mid];
        for(int i=0;i<mid;i++){
            left[i]=a[i];
        }
        for(int j=mid;j<n;j++){
            right[j-mid]=a[j];
        }
        mergeSort(left,mid);
        mergeSort(right,n-mid);
        merge(a,left,right,mid,n-mid);
    }

    private static void merge(Integer[] source, Integer[] left, Integer[] right, int lMax, int rMax) {
        int i=0,j=0,k=0;
        while(i<lMax&&j<rMax){
            if(left[i]<right[j]){
                source[k++]=left[i++];
            }else{
                source[k++]=right[j++];
            }
        }
        while(i<lMax){
            source[k++]=left[i++];
        }
        while(j<rMax){
            source[k++]=right[j++];
        }
    }


}
