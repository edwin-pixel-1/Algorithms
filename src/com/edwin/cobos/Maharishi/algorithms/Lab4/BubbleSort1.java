package com.edwin.cobos.Maharishi.algorithms.Lab4;

public class BubbleSort1 {
    public static void main(String arg[]){
        for(int ele: bubbleSorting(new int[]{2,3,5,3,1,6}))
        {
            System.out.println(ele +" ");
        }
    }
    public static int[] bubbleSorting(int[] a){
        int len=a.length;
        for(int i=0;i<len;i++){
            boolean flag=false;
            for (int j=0;j<len-1;j++){
                if(a[j]>a[j+1]){
                    int tmp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                    flag=true;
                }
            }
            if(!flag)break;
        }
        return a;
    }
}