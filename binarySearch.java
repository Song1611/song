import java.util.*;
public class binarySearch {
    public static boolean binarySearch(int[] a,int n,int x){
        int left = 0 ,right = n-1;
        while(left<=right){
            int m = (left+right)/2;
            if(x == a[m]){
                return true;
            }
            else if(a[m]>x){
                right = m - 1;
            }
            else{
                left  = m + 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int x =  sc.nextInt();
        System.out.println(binarySearch(a,n,x));
    }
}
