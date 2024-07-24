package non_repeating_char_in_strings;
import java.util.*;

public class non_repeating_char_in_strings {

    public static void nonRepeatChar(String str){
        int count = 0;
        char[] charArray = str.toCharArray();
        int n = str.length();
        for(int i=0;i<n;i++){
            count = 0;
            for(int j=0;j<n;j++){
                if(charArray[j] == charArray[i]){
                    count++;
                }
            }
            if(count == 1){
                System.out.print(charArray[i]+", ");
            }
            else{
                System.out.println("There is no single repeating element");
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String();
        System.out.println("Enter the string : ");
        str = sc.nextLine();
        System.out.println("The non repeating character(s) are : ");
        nonRepeatChar(str);
        sc.close();
    }    
}
