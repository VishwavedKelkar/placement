package remove_brackets_from_algebric_expression;
import java.util.*;

public class remove_brackets_from_algebric_expression {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the algebric expression : ");
        String exp = sc.nextLine();
        removeBrackets(exp);
        sc.close();
    }    
    static void removeBrackets(String s){
        String s2 = s.replaceAll("[(){}]","");
        System.out.println(s2);
    }
}
