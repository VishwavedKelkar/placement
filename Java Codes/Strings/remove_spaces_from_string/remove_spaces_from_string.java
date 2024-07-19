package remove_spaces_from_string;
import java.util.*;

public class remove_spaces_from_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();
        String s1 = str.replaceAll(" ","");
        System.out.println(s1);

        sc.close();
    }    
}
