import java.util.*;

public class disjoint_array_or_not {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter the size of the first array : ");
        int size1 = sc.nextInt();
        System.out.println("Enter the size of the second array : ");
        int size2 = sc.nextInt();

        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];
        System.out.println("Enter the elements of the first array : ");
        for(int i=0;i<size1;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of the second array : ");
        for(int i=0;i<size2;i++){
            arr2[i] = sc.nextInt();
        }

        disjointOrNot(arr1, arr2, size1, size2);
        sc.close();
    }
    public static void disjointOrNot(int[] arr1,int[] arr2,int size1,int size2){
        boolean isDisjoint = false;
        for(int i=0;i<size1;i++){
            for(int j=0;j<size2;j++){
                isDisjoint = true;
                if(arr1[i] == arr2[j]){
                    isDisjoint = false;
                    break;
                }
                else{
                    isDisjoint = true;

                }
            }
        }
        if(isDisjoint){
            System.out.println("The two arrays are disjoint");
        }
        else{
            System.out.println("The two arrays are not disjoint");
        }
    }
}
