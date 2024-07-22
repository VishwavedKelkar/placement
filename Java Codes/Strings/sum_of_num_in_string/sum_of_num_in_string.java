package sum_of_num_in_string;
import java.util.*;

public class sum_of_num_in_string {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.nextLine();
        String s1 = s.replaceAll("[a-zA-Z]","");
        int sum = 0;
        for(int i=0;i<s1.length();i++){
            sum = sum + s1.charAt(i)-'0';
        }
        System.out.println(sum);
        sc.close();
    }    
}
