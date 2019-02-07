package Shell_sort;


/*
Shell sort uses insertion order internal.
    Complexity depends on increment value
    complexity **  less than insertionSort complexity
 */
import java.util.Arrays;
import java.util.function.IntConsumer;

public class Shell_sort {

    static  int[]    input_array = {1,5,6,4,2,7,10,3,8,9};
    public static  void main(String args[]){

        shellsort(input_array);
    }


    public static  void shellsort(int []input_array){
        int increment=input_array.length/2;

        System.out.println("Input  Each Element ");
        Arrays.stream(input_array).forEach(new IntConsumer() {
            @Override
            public void accept(int value) {
                System.out.printf(" "+value);
            }
        });

        while(increment>=1){
            for (int startIndex=0;startIndex<increment;startIndex++){
                 insertionSort(startIndex,increment);
            }
            increment=increment/2;
        }
        System.out.println();
        System.out.println("Output Each Element ");
        Arrays.stream(input_array).forEach(new IntConsumer() {
            @Override
            public void accept(int value) {
                System.out.printf(" "+value);
            }
        });

    }

    public  static  void  insertionSort(int startIndex,int increment){
        for (int i=startIndex;i<input_array.length;i=i+increment){
            for(int j=Math.min(i+increment,input_array.length-1);j-increment>=0;j=j-increment){

                if( input_array[j] <input_array[j-increment]){
                    int temp =input_array[j];
                    input_array[j]=input_array[j-increment];
                    input_array[j-increment]=temp;
                }else {
                    break;
                }
            }
        }



    }
}
