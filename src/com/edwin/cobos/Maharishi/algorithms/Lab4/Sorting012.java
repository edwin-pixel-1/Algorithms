package com.edwin.cobos.Maharishi.algorithms.Lab4;

public class Sorting012 {
    private static int[] arr;
    public static void main(String arg[]){
        arr=new int[]{1,2,0,2,1,2};
        sorting();
        for(int i:arr){
            System.out.println(i +" ");
        }
    }
    public static void sorting(){
        int len=arr.length;
        int a=0;
        int b=0;
        for (int i=0;i<len;i++){
            if(arr[i]==0)a++;
            else if(arr[i]==1)b++;
        }
        for(int i=0;i<len;i++){
            if(a!=0){
                arr[i]=0;
                a--;
            }else if(b!=0){
                arr[i]=1;
            }
            else arr[i]=2;
        }
    }
}