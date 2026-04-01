import java.util.*;

public class Linear_searching {
    public static int linearSearch(int number[],int key){
        for(int i=0; i<number.length;i++){
            if (number[i]== key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = { 234,67,8,7,10,34};
        int key = 10;
        int index = linearSearch(number, key);
        if (index == -1) {
            System.out.println("Not Founde in any indexing  :" + key);
            
        }else {
            System.out.println(key + " key is  index number is :" + index );
        }
        // time complexity of O(n) bracase n number of loop
    }
    
}
