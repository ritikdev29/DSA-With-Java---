
// three type of constructor 1. defalt or non parameterized constructor , 2. Paramiterized constructor , 3. copy constructor

import java.sql.Struct;

public class Types_of_constructor_06 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Ritik kumar");
        Student s3 = new Student(47);
        
    }
    
}
class Student {
    String name;
    int roll;

    Student(){    // this is non paramiterized cons..
        System.out.println("I am constructor...");

    }
    Student(String name ){
      this.name = name;
    
    }
    Student (int roll){
        this.roll = roll;
    }
}
