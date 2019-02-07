package SelectionSort;

import java.util.Arrays;

/*
Complexity is N2

It is not adoptive.. Ie (It could not find whether liste are sorted or not)


 */



public class selection_sort {



    public static void main(String args[]){
         int[]   input_array = {1,5,6,4,2,7,10,3,8,9};
         System.out.println("Inout Each Element ");
         Arrays.stream(input_array).forEach(System.out::println);


            for (int i=0;i<input_array.length;i++){
                for (int j=i+1 ;j< input_array.length;j++){
                    if (input_array[i] >input_array[j]){
                        int temp =input_array[j];
                        input_array[j]=input_array[i];
                        input_array[i]=temp;
                    }
                }
            }
            System.out.println("Output Each Element ");
            Arrays.stream(input_array).forEach(System.out::println);



    }


}
