package CustomDefined;

public class Element<T> {
    private  T data;
    private Element next;

    public  Element(T data_input){
        this.data=data_input;

    }

    public Element<T> getNext(){
        return  next;
    }
    public  void setNext(Element<T> next){
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


