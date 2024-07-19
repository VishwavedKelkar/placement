package remove_char_otherthan_alphabets;
import java.util.*;

public class remove_char_otherthan_alphabets {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.nextLine();
        String s1 = s.replaceAll("[^a-zA-Z]", "");
        System.out.println(s1);
        sc.close();

    }
}
