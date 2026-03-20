// package practice question;
import java.util.*;
import java.util.Scanner;

public class qes_one {
    public static void main(String[] args) {
      /*   Scanner sc = new Scanner(System.in);

       System.out.print("Enter th first mark :");
       int a = sc.nextInt();
       System.out.print("enter your second number:");
       int b = sc.nextInt();
       System.out.print("enter your third marks:");
       int c = sc.nextInt();

       int avg = (a+b+c) / 3;
       System.out.println("Your final Average number is :" + avg);

       {
        // question input the side of a squre . you have to outpuut the area of the square
        Scanner fg = new Scanner(System.in);
        // int side;
        System.out.print("Enter the values : ");
        int side = sc.nextInt();
        int area = side * side;
        System.out.print("Your area is  : " + area);

       }
         
    }*/

    {
        // Bill Of Item...
        // (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem
        // float pencil = 20;
        // float pen = 5;
        // float eraser = 34;
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the first in float : ");
        float pencil = sc.nextFloat();
        System.out.print("Enter the second in float : ");
        float pen = sc.nextFloat();
        System.out.print("Enter the third in float : ");
        float eraser = sc.nextFloat();

        float total = pencil + pen + eraser;
        System.out.println("Total bill is : " + total);

        //Add on - with 18% tax....
        float newTotal = total + (0.18f * total);
        
        System.out.println("Your final value is : " + newTotal);
        int $ = 24;
        System.out.println("Your $ valu is  = " + $);
        
        
    }
}
 
}
    


    

