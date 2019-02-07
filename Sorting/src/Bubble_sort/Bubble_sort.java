package Bubble_sort;

/*
It is adoptive (Ie: it  has ability to break if items are already sorted)

N2 in complexity

 */


import java.util.Arrays;
import java.util.function.IntConsumer;

public class Bubble_sort {

    public static  void main(String args[]){
        int[]   input_array = {1,5,6,4,2,7,10,3,8,9};
        System.out.println("Inout Each Element ");
        Arrays.stream(input_array).forEach(new IntConsumer() {
            @Override
            public void accept(int value) {
                System.out.printf(" "+value);
            }
        });

        for (int i=0;i<input_array.length-1;i++){
            boolean swapped=false;
            for (int j=0 ;j< input_array.length-1;j++){
                if (input_array[j] >input_array[j+1]){
                    int temp =input_array[j];
                    input_array[j]=input_array[j+1];
                    input_array[j+1]=temp;
                    swapped=true;
                }
            }
            if (!swapped)
                break;
           }
        System.out.println("Output Each Element ");
        Arrays.stream(input_array).forEach(new IntConsumer() {
            @Override
            public void accept(int value) {
                System.out.printf(" "+value);
            }
        });



    }


}
