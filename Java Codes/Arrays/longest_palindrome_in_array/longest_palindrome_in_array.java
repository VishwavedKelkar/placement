import java.util.*;
public class longest_palindrome_in_array {

    public static int isPalindrome(int num){
        int rem ,rev = 0;
        while(num != 0){
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        return rev;
    }

    public static void isLongestPalindrome(int[] arr){
        int temp = arr[0] ;
        int max = 0;
        for(int i=0;i<arr.length;i++){
            temp = isPalindrome(arr[i]);
            if(temp > max){
                max = temp;
            }
        }
        System.out.println("\nThe longest palindrome is : "+max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {121,100,101010101,1001,200};
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        isLongestPalindrome(array);
        sc.close();
    }

}
