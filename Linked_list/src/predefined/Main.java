package predefined;

import java.util.LinkedList;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> list_items= new LinkedList<>();

        for (int  i=1;i<=100;i++){
            list_items.add(i);
        }
        list_items.stream().forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer item) {
                System.out.println("Out put ---->"+item);
            }
        });


    }
}
