import java.util.*;

public class count_distinct_elements_in_array{
    public static void distinctNum(int[] arr){
        boolean[] visited = new boolean[arr.length];
        Arrays.fill(visited,false);
        int count = 0;

        for(int i=0;i<arr.length;i++){
            if(visited[i] == true){
                continue;
            }

            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    visited[j] = true;
                }
            }
            count += 1;
        }
        System.out.println(count);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size= sc.nextInt();
        System.out.println("Enter the elements of the array : ");
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        distinctNum(arr);
        sc.close();
    }
}