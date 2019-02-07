package QuickSort;
/*
It uses divide and conquer
    It does use length to divide it divide based on pivot item.
    complexity is NlogN
 */

import java.util.Arrays;
import java.util.function.IntConsumer;

public class Quick_sort {

    static  int[]    input_array = {1,5,6,4,2,7,10,3,8,9};
    public static  void main(String args[]){
        System.out.println("Input Array :");
        Arrays.stream(input_array).forEach(new IntConsumer() {
            @Override
            public void accept(int value) {
                System.out.printf(" "+value);
            }
        });
        System.out.println();

        QuickSort(0,input_array.length-1);
        System.out.println("Output Array :");
        Arrays.stream(input_array).forEach(new IntConsumer() {
            @Override
            public void accept(int value) {
                System.out.printf(" "+value);
            }
        });
        System.out.println();

    }

    public  static  void QuickSort(int low_index,int high_index){
        if (low_index>=high_index)
            return;
        int pivot_index =parition(low_index,high_index);
        QuickSort(low_index,pivot_index-1);
        QuickSort(pivot_index+1,high_index);
    }

    public static  int parition(int low,int high){
        int pivot =input_array[low];
        int l=low;
        int h= high;

        while(l<h){
            while (input_array[l] <=pivot && l<h){
                l++;
            }
            while (input_array[h]>pivot){
                h--;
            }
            if (l<h){
                swap(l,h);
            }
        }
        swap(low,h);
        return h;
    }


    public static  void swap(int low,int high){
        int temp=input_array[high];
        input_array[high]=input_array[low];
        input_array[low]=temp;
    }






}
