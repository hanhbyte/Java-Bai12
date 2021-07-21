package Prectice3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Binh", 23, "HP");
        Student student1 = new Student("Nam", 20, "HN");
        Student student2 = new Student("Van", 21, "HT");
        Student student3 = new Student("Cuong", 22, "NA");

        List<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for (Student st : lists){
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("age comparison: ");
        for (Student st : lists){
            System.out.println(st.toString());
        }
    }
}
