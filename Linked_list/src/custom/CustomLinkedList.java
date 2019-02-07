package custom;

import java.util.Comparator;

public class CustomLinkedList<T extends Comparator<T>> implements Cloneable {
    private CustomeNode<T> head = null;

    public CustomLinkedList() {

    }

    public void addNode(T input_data) {
        if (head == null) {
            head = new CustomeNode(input_data);
        }
        CustomeNode<T> current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(new CustomeNode(input_data));
    }


    public void printNodes() {
        CustomeNode<T> current = head;
        while (current.getNext() != null) {
            System.out.print(current.getData().toString());
        }
    }

    public int countNodes() {
        CustomeNode<T> current = head;
        int counter = 0;
        if (head == null)
            return counter;
        counter++;
        while (current.getNext() != null) {
            counter++;
        }
        return counter;
    }

    public T popData(T input_data) {
        CustomeNode<T> current = head;
        CustomeNode<T> previous = head;

        if (head == null) {
            return null;
        }
        if (head.getData() == input_data) {
            head = null;
            return null;
        }
        while (current.getNext() != null) {
            previous = current;
            current = current.getNext();
            if (current.getData() == input_data) {
                if (current.getNext() != null) {
                    previous.setNext(current.getNext());
                } else {
                    previous.setNext(null);
                }
                return input_data;
            }

        }
        return null;
    }

    public T popData() {
        if (head != null) {
            return null;
        } else {
            T output_data = head.getData();
            head.setNext(head.getNext());
            return output_data;
        }
    }

    public void deleteAllData() {
        head = null;
    }

    public void insertNthData(int n, T input_data) {
        if (n > countNodes()) {
            return;
        } else {
            if (head == null) {
                head = new CustomeNode(input_data);
                return;
            }
            if (n == 0) {
                CustomeNode data = new CustomeNode(input_data);
                data.setNext(head);
                return;
            }
            int counter = 0;
            CustomeNode<T> current = head;
            CustomeNode<T> previous = head;

            while (current.getNext() != null) {
                if (counter == n) {
                    CustomeNode data = new CustomeNode(input_data);
                    data.setNext(current);
                    previous.setNext(data);
                    return;
                }
                previous = current;
                current = current.getNext();
                counter++;
            }
            return;
        }


    }

    public T popNthData(int n) {
        if (n > countNodes() || head == null) {
            return null;
        } else {
            T output_data=null;
            if (n == 0) {
                output_data=head.getData();
                head = head.getNext();
                return output_data;
            }
            int counter = 0;
            CustomeNode<T> current = head;
            CustomeNode<T> previous = head;

            while (current.getNext() != null) {
                if (counter == n) {
                    output_data=current.getData();
                    previous.setNext(current.getNext());
                    return output_data;
                }
                previous = current;
                current = current.getNext();
                counter++;
            }
            return null;
        }
    }


    public void reverseList() {
        CustomeNode<T> current = head;
        CustomeNode<T> reverseCurrent = null;
        CustomeNode<T> reversePrevious = null;
        CustomeNode<T> reverseHead = null;

        if ((head == null) || (current.getNext() == null)) {
            return;
        }
        int totalCountNodes = countNodes();

        while (current.getNext() != null) {
            reverseCurrent=new CustomeNode<>(popNthData(totalCountNodes));
            totalCountNodes--;
            current=current.getNext();

            if (reverseHead == null){
                reverseHead=reverseCurrent;
                reversePrevious=reverseCurrent;
            }
            reversePrevious.setNext(reverseCurrent);
            reversePrevious=reversePrevious.getNext();
        }


    }

}
