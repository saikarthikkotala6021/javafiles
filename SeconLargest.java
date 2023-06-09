import java.util.*;
public class SeconLargest {

    static int findLargest(int arr[],int n){
        int max = arr[0];
        int secmax = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(max<arr[i]){
                secmax = max;
                max = arr[i];
            }
            if(max>arr[i] && arr[i]>secmax){
                secmax = arr[i];
            }
        }
        return secmax;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 6;
        int arr[] = [4, 3, 6, 8, 9, 7];
        System.out.println("Second Largest element :"+findLargest(arr,n));
        
    }
}
