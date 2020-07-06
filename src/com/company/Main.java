package com.company;

public class Main {

    public static void sort (int [] arr, int m){
        int k = 0;
        int [] arrHelp = new int [m];

        for (int i=0;i<arr.length;i++){
            arrHelp[arr[i]]++;
        }

        for (int i=0;i<arrHelp.length;i++){
            for (int z = 0; z<arrHelp[i]; z++){
                arr[k]=i;
                k++;
            }
        }

    }

    public static void main(String[] args) {
        int arr [] = { 4 , 4, 0, 0, 0, 0,1,1,1,1,1,1,1,1,3,3};
        sort(arr,5);
    }
}
