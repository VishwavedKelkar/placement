package remove_vowels_from_a_string;
import java.util.*;

public class remove_vowels_from_a_string {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();
        String withoutVowelString = "";
        char[] vowel = {'a','A','e','E','i','I','o','O','u','U'};
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            boolean isVowel = false;
            for(int j=0;j<vowel.length;j++){
                if(ch == vowel[j]){
                    isVowel = true;
                    break;
                }
            }
            if(!isVowel)
            withoutVowelString = withoutVowelString + ch;
        }
        System.out.println("The st ring without vowels is : "+withoutVowelString);
        sc.close();
    }

}
