import java.util.*;

public class counting_odd_nd_even_elements_in_array {

    public static void oddEvenCount(int[] arr,int size){
        int oddCount = 0;
        int evenCount = 0;
        for(int i=0;i<size;i++){
            if(arr[i] % 2 == 0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        System.out.println("Odd Count : "+oddCount);
        System.out.println("Even count is : "+evenCount);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int size  = sc.nextInt();
        System.out.println("Enter the array elements : ");
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        oddEvenCount(arr,size);
        sc.close();
    }    

}
