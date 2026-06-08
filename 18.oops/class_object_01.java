public class class_object_01 {

    public static void main(String[] args) {
        Pen p1 = new Pen(); // create object ---> or cre pen object from p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(10);
        System.out.println("Tip is : " + p1.tip);

        p1.setColor("Red..");
        System.out.println("new color is : " + p1.color);

        // create object for student --->
        Student s1 = new Student();
        s1.calcutate_percantage(89, 99, 70);
        System.out.println("Your percentage is : " + s1.percentage);
    }

}

// pen class create ---->
class Pen {
    String color;
    int tip;

    // create function
    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

// Student class create
class Student {
    String name;
    int age;
    int id;
    float percentage; // cgpa

    void calcutate_percantage(int phy, int math, int chem) {
        percentage = (phy + math + chem) / 3;
    }
}
