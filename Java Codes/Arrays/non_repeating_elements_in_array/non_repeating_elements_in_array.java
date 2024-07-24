import java.util.Scanner;

public class non_repeating_elements_in_array {
    public static void nonRepeatingElements(int[] arr){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            count = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count<2){
                System.out.print(arr[i] + " ");
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the array : ");
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The non repeating element(s) are : ");
        nonRepeatingElements(arr);
        sc.close();
    }    
}
