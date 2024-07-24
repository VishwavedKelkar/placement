import java.util.*;

public class removing_duplicate_elements_from_array {
    public static void duplicateElement(int[] arr){
        int[] newArr = new int[arr.length];
        int j = 0;
        for(int i=0;i<arr.length;i++){
            boolean isDuplicate = false;
            for(int k=0;k<j;k++){
                if(arr[i] == newArr[k]){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                newArr[j] = arr[i];
                j++;
            }
            System.out.print(arr[i]+" ");            
        }
        System.out.println("\nAfter deletion of duplicate elements : ");        
        for(int i=0;i<j;i++)
            System.out.print(newArr[i]+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 20, 30, 40, 40, 40, 50, 50,70,70};
        System.out.println("The duplicate elements are : ");
        duplicateElement(arr);
        sc.close();
    }
    
}
