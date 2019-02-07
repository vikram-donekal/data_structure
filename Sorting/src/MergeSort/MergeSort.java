package MergeSort;
/*
Uses Divide and conquer

    complexity is NlogN
   Merge Sort is not Adative
   It takes order of N extra spaces in divide and merge phase


 */


import java.util.Arrays;
import java.util.function.IntConsumer;

public class MergeSort {


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

        mergeSort(input_array);
        System.out.println("Output Array :");
        Arrays.stream(input_array).forEach(new IntConsumer() {
            @Override
            public void accept(int value) {
                System.out.printf(" "+value);
            }
        });
        System.out.println();

    }


    public static  void mergeSort(int[] listToSort){
        if (listToSort.length ==1){
            return;
        }
        int midIndex=listToSort.length/2;
        int [] listFirstHalf = new int[midIndex];
        int [] listSecondHalf = new int[listToSort.length-midIndex];
        split(listToSort,listFirstHalf,listSecondHalf);

        mergeSort(listFirstHalf);
        mergeSort(listSecondHalf);
        merge(listToSort,listFirstHalf,listSecondHalf);

    }

    public  static void split(int[] input_array,int[] first_half,int [] second_half){
        int index=0;
        int second_half_index=input_array.length/2;
        int second_half_index_counter=0;
        for(int number: input_array){

            if (index <second_half_index){
                first_half[index]=number;
            }else {
                second_half[second_half_index_counter]=number;
                second_half_index_counter++;
            }
            index++;

        }
    }

    public static void merge(int [] output_array, int[] first_half,int [] second_half ){
        int merger_index=0;
        int first_half_index=0;
        int second_half_index=0;


        while(first_half_index < first_half.length && second_half_index < second_half.length ){

            if(first_half[first_half_index] <second_half[second_half_index]){
                output_array[merger_index]=first_half[first_half_index];
                first_half_index++;
            }else {
                output_array[merger_index]=second_half[second_half_index];
                second_half_index++;
            }
            merger_index++;
        }
        if ( first_half_index < first_half.length){
            for(; first_half_index<first_half.length;first_half_index++){
                output_array[merger_index]=first_half[first_half_index];
                merger_index++;
            }
        }

        if ( second_half_index < second_half.length){
            for(; second_half_index<second_half.length;second_half_index++){
                output_array[merger_index]=second_half[second_half_index];
                merger_index++;
            }
        }
    }
}
