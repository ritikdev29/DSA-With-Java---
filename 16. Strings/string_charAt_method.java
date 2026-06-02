public class string_charAt_method {
    public static void printLetter(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        String firstname = "Ritik";
        String lastname = "Kumar ";
        String fullname = firstname + " " + lastname;
        System.out.println(fullname);
        printLetter(fullname);
    }

}
