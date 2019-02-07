package custom;

import java.util.LinkedList;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        CustomLinkedList<Student> list_items= new CustomLinkedList<>();


        for (int  i=1;i<=100;i++){
            Student temp= new Student(i,"a"+1,"b"+1);
            list_items.addNode(temp);
        }
        list_items.printNodes();


    }
}