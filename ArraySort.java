import java.util.*;
public class ArraySort {
    static boolean Sort(int a[], int n){
        int min = a[0];
        for(int i=0;i<a.length;i++){
            if(min>a[i])
                return false;
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(Sort(a, n));
        
    }
    
}
