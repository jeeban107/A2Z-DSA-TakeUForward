package Recursion;

import java.util.Scanner;



public class ReverseArr {

    void printArr(int arr[] ,int n ){
        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i]+" ");
        }
    }

//With Normal Function
    void RevArr(int arr[], int n){
        int l =0 ;
        int r = n-1;
        while(l<r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r]=  temp;
            l++;
            r--;
        }
        printArr(arr ,n);
    }

//With Recursion
    void  Swap (int arr[],int start ,int end) {
         int temp = arr[start];
         arr[start]= arr[end];
         arr[end]= temp;

    }

    void RevArr2 (int arr[] ,int start , int end){
        if(start >= end){
            printArr(arr, arr.length);
            return;
        }
        else {
            Swap(arr, start ,end);
            RevArr2(arr ,start+1 ,end-1);
        }

    }

//Recursion with One Variable

    void  RevArr3(int arr[] ,int n ,int i){
        if (i>=n/2 ){
            printArr(arr, arr.length);
            return ;
        }
        else {
            Swap(arr,i, n-i -1);
            RevArr3(arr ,n ,i+1);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Array Size");
        int n = sc.nextInt();


        int[] arr = new int [n];
        for (int i = 0;i <n ; i++) {
            arr[i] = sc.nextInt();
        }

        ReverseArr rv   = new ReverseArr();
//        rv.printArr(arr , n);
//            rv.RevArr(arr,n);
//        rv.RevArr2(arr,0,n-1);
            rv.RevArr3(arr ,n ,0);

    }
}
