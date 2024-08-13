//Supplier: It only supplies the required objects, does not take any input arguments
//->It has get() method

import java.util.ArrayList;
import java.util.function.Supplier;
class Student{
     int rollNo;
     String name;
     Student(int rollNo,String name){
      this.rollNo=rollNo;
      this.name=name;
     }
}
public class SupplierFI {
    public static void main(String[] args) {
        Supplier<Student> s1=()->new Student(101, "Raviteja");
        Supplier<Student> s2=()->new Student(102, "Naveen");
        Supplier<Student> s3=()->new Student(103, "Vamshi");
        ArrayList<Student> students=new ArrayList<>();
        students.add(s1.get());
        students.add(s2.get());
        students.add(s3.get());

        for(Student s:students){
            System.out.println("Roll Number :"+s.rollNo);
            System.out.println("Student Name :"+s.name);
        }
    }
}
