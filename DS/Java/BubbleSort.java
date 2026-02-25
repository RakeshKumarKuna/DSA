package DS.Java;

import java.util.Arrays;

public class BubbleSort {
    public static int[] bubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                System.out.println(Arrays.toString(arr));
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
        return arr;
    }
    
    public static void swap(int arr[],int i,int j){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
    }
    public static void main(String[] args) {
        int arr[]={455,84,95,2,6,4,158};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
}
