class Pen {
    private String color;
    int tip;
   
    // this is getter
    String getcolor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    // this is setters
    void setColor(String newcolor){
        this.color = newcolor;
    }
    void setColor(int tip){
        this.tip = tip;
    }
}

public class Getter_Setter_03 {
    public static void main(String[] args) {
         Pen p1 = new Pen(); // create object ---> or cre pen object from p1
        p1.setColor("Blue");
        System.out.println(p1.getcolor());
        p1.setColor(5);
        System.out.println("Tip is : " + p1.getTip());

        p1.setColor("Red..");
        System.out.println("new color is : " + p1.getcolor());

    }

}
