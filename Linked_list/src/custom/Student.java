package custom;

import java.util.Comparator;

public class Student implements Comparator<Student> {
    Integer roll_no;
    String FirstName;
    String LastName;
    public  Student(Integer i1,String s1,String s2){
        this.roll_no=i1;
        this.FirstName=s1;
        this.LastName=s2;
    }

    @Override
    public int compare(Student o1, Student o2) {

        return 0;
    }
}
