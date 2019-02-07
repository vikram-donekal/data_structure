package Insertion_sort;

/*
complexity n2
It is adaptive
Insertion vs Bubble
    1:Bubblde sort uses N comparison to sort internally in each iteration
      Insertion Sort less N comparison untill it gets correct position .

 */

import java.util.Arrays;

public class Insertion_sort {


    public static void main(String args[]){
        int[]   input_array = {1,5,6,4,2,7,10,3,8,9};
        System.out.println("Input Each Element ");
        Arrays.stream(input_array).forEach(System.out::println);


        for (int i=0;i<input_array.length;i++){
            for (int j=i+1 ;j > 0;j--){
                if (input_array[j] >input_array[j-1]){
                    int temp =input_array[j];
                    input_array[j-1]=input_array[j];
                    input_array[j-1]=temp;
                }else {
                    break;
                }
            }
        }
        System.out.println("Output Each Element ");
        Arrays.stream(input_array).forEach(System.out::println);



    }


}
