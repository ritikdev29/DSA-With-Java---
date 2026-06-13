public class StringsBuilder_12 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(" ");
        for(char ch = 'a'; ch<'z';ch++){
            sb.append(ch);
            

        }
        System.out.println("Your String value is : "+sb);  // Time complexit is = O(26)
        System.out.println("Total length is : "+sb.length());
        // System.out.println(sb.replace(2, 5, "Ritik Kumar "));
    }
    
    
}
