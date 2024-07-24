package freq_of_ch_in_string;
import java.util.*;

public class freq_of_ch_in_string {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.nextLine();

        sc.close();
    }    
    public static void freqOfCharacter(String s){
        int[] count = {};
        char[] s1 = s.toCharArray();
        for(int i=0;i<s1.length;i++){
            count[i] = 0;
            
        }
    }
}
