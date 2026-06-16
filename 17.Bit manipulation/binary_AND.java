public class binary_AND {
    public static void main(String[] args) {
        int user1= 13;  // binary no is = 1101
        int user2 = 11; // binary no is = 1011

        // AND operator dononumber par make

       int commonPermission =  user1 & user2;

       // Integer.toBinaryString() decimal to binary conver karta hai...

       System.out.println("User1 binary number : " + Integer.toBinaryString(user1));
       System.out.println("user2 Binary :" + Integer.toBinaryString(user2));

       System.out.println("Common permission Binary : " + Integer.toBinaryString(commonPermission));


       System.out.println("Common permission decimal : " + commonPermission); // outpt = 9

    }
    
}
