package to_reverse_array;
import java.util.*;

public class to_reverse_array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        for(int i=s.length()-1;i>=0;i--){
            System.out.print(ch[i]);
        }
    }
    
}
