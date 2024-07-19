package String_is_palindrome_or_not;
import java.util.*;

public class String_is_palindrome_or_not {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.nextLine();
        String s1 = s.toLowerCase();
        char[] ch = s1.toCharArray();
        boolean isPalindrome = true;
        
        for(int i=0;i<s1.length()/2;i++){
            if(ch[i] != ch[s1.length()-i-1]){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("The string "+ s1+" is a palindrome");
        }
        else{
            System.out.println("The string "+ s1+" is not a palindrome");
        }
        sc.close();
    }
}
