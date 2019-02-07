package custom;
import java.util.Comparator;

public class CustomeNode<T extends  java.util.Comparator<T>> {
    private T data;
    private  CustomeNode<T> next;

    public  CustomeNode(T data_input){
        this.data=data_input;

    }

    public CustomeNode<T> getNext(){
        return  next;
    }
    public  void setNext(CustomeNode<T> next){
        this.next=next;
    }

    public T getData() {
        return data;
    }
    @Override
    public String toString(){
        return String.valueOf(data);
    }
}
