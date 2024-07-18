package char_alphabet_or_not;
import java.util.*;

public class char_alphabet_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any characters you want : ");
        String charString = sc.nextLine();
        for(int i=0;i<charString.length();i++){
            char ch = charString.charAt(i);
            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
                System.out.println(ch + " is an alphabet");
            }
            else{
                System.out.println(ch +" is a special character");
            }
        }
        sc.close();
    }
}
