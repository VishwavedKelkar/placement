import java.util.*;

public class find_max_scalar_product{

    public static void sortArrays(int[] arr1,int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    public static void Max_Scalar_product(int[] arr1,int[] arr2,int size){
        sortArrays(arr1, arr2);
        int product = 0;
        for(int i=0;i<size;i++){
            product += arr1[i]*arr2[i];
        }
        System.out.println(product);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size for both the arrays : ");
        int size = sc.nextInt();
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];

        System.out.println("Enter the elements of the first array of size  "+size+" : ");
        for(int i=0;i<size;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of the second arraay of size "+size+" : ");
        for(int i=0;i<size;i++){
            arr2[i] = sc.nextInt();
        }
        System.out.println("The maximum scalar product is : ");
        Max_Scalar_product(arr1, arr2,size);
        sc.close();
    }
}