package StringLength;
import java.util.*;

public class StringLength {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the characters : ");
        String string = sc.nextLine();
        int count=0;
        for(int i=0;i<string.length();i++){
            count++;
        }
        System.out.println("The length of the string is : "+count);
        sc.close();
    }
}
