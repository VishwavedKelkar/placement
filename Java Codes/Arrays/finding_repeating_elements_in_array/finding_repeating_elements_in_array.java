import java.util.*;

class finding_repeating_elements_in_array{

    public static void repeatElement(int[] arr){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            count = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[j] == arr[i]){
                    count++;
                }
            }
            if(count > 1){
                System.out.print(arr[i]+", ");
                continue;
            }
        }
        if(count<=1){
            System.out.println("No such repeating element");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The repeating elements are : ");
        repeatElement(arr);
        sc.close();
    }
}