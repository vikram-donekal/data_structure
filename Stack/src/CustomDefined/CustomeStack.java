package CustomDefined;

public class CustomeStack <T>{

    private  static final  int   MAX_SIZE=100;
    private Element top;
    private int size=0;

    public void push(T input_data) throws  StackOverFlowException{
        if (size == CustomeStack.MAX_SIZE){
            throw  new StackOverFlowException("Overflow");
        }
        Element data= new Element(input_data);
        data.setNext(top);
        top=data;
        size++;
    }
    public T pop() throws StackUnderFlowException{
        if (size ==0){
            throw  new StackUnderFlowException("Under Flow");

        }
        T output = (T ) top.getData();
        top=top.getNext();
        size--;
        return output;

    }
    public  T peek()throws StackUnderFlowException{
        if (size==0){
            throw  new StackUnderFlowException("Under Flow");
        }
        return (T) top.getData();
    }
    public Boolean isEmpty(){
        return  size ==0;
    }
    public  Boolean isFull(){
        return size ==CustomeStack.MAX_SIZE;
    }
    public  int getSize(){
        return  size;
    }



}
