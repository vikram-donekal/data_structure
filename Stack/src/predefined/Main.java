package predefined;

import java.util.Stack;
import java.util.function.Consumer;

public class Main {
    public static  void main(String args[]){
        System.out.println("Stack Predefined");


        Stack<String> stack= new Stack<>();
        for (int i=0;i<100;i++){
            stack.push("a"+i);

        }
        stack.listIterator().forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Out put ---->"+s);
            }
        });
    }
}
