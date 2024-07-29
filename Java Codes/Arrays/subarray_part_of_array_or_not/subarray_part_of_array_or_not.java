import java.util.*;

public class subarray_part_of_array_or_not{
    public static void subarrayinArrayOrNot(int[] arr,int[] subarray,int size,int subsize){
        int j=0;
        for(int i=0;i<size;i++){
            for(j=0;j<subsize;j++){
                if(subarray[j] == arr[i]){
                    break;
                }
            }
        }
        if(j==(subsize-1))
            System.out.println("The subarray is a part of the array");
        else
            System.out.println("The subarray is not a part of the array");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the size of the subarray : ");
        int subSize = sc.nextInt();
        int[] subArray = new int[subSize];
        System.out.println("Enter the elements of the subarray : ");
        for(int i=0;i<subSize;i++){
            subArray[i] = sc.nextInt();
        }
        subarrayinArrayOrNot(arr, subArray, size, subSize);
        sc.close();
    }
}