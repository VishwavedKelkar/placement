package Capitalize_first_and_last_letter_of_every_word;
import java.util.*;

public class Capitalize_first_and_last_letter_of_every_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s= sc.nextLine();
        Capitalize(s);
        sc.close();
    }
    public static void Capitalize(String s){
        String nxt = "";
        String[] strArray = s.split("\\s");

        for(String s1 : strArray){
            String firstChar = s1.substring(0,1);
            String lastChar = s1.substring(s1.length()-1, s1.length());
            String restChar = s1.substring(1, s1.length()-1);
            nxt = nxt + firstChar.toUpperCase() + restChar.toLowerCase() + lastChar.toUpperCase() + " ";
        }
        System.out.println(nxt);
    }
}
