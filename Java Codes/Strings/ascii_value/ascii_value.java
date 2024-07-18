package ascii_value;
import java.util.*;

public class ascii_value {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        String charString = sc. next();
        for(int i=0;i<charString.length();i++){
            char ch = charString.charAt(i);
            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z' )){
            System.out.println("The ASCII value of "+ch+" is "+ (int) ch);
            }
        }
        sc.close();
    }
    
}
