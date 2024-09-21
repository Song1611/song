import java.util.*;
public class minCuoiMaxDau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int min_value = a[0], min_index = 0;
        for(int i  = 0;i<n;i++){
            if(min_value>=a[i]){
                min_value=a[i];
                min_index=i;
            }
        }
        System.out.println(min_value + " "+ min_index);
        int max_index=0,max_value=a[0];
        for(int i = 0;i<n;i++){
            if(max_value<a[i]){
                max_value=a[i];
                max_index =i;
            }
        }
        System.out.println(max_value +" "+ max_index );
    }
}
