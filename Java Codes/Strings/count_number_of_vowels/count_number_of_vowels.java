package count_number_of_vowels;
import java.util.*;

public class count_number_of_vowels {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter the string : ");
        String s = sc.nextLine();
        char[] vowels = {'a','A','e','E','i','I','o','O','u','U'};
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            for(int j=0;j<vowels.length;j++){
                if(ch == vowels[j]){
                    count = count + 1;
                }
            }
        }
        System.out.println("Number of vowels in the string : "+count);
        sc.close();
    }
}
