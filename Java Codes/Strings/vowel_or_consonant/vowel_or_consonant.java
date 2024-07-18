package vowel_or_consonant;
import java.util.*;

public class vowel_or_consonant{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any alphabets you want :  ");
        String inputString = sc.nextLine();
        
        for(int i=0;i<inputString.length();i++){
            char ch = inputString.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                System.out.println(ch + " is a vowel");
            }
            else{
                System.out.println(ch + " is a consonant");
            }
        }
        sc.close();
    }
}