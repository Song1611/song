import java.util.*;
public class soLonNhataVaThuHai {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n  = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++){
            a[i]= sc.nextInt();
        }
        int max1 =0, max2=0;
        for(int i = 0;i<n;i++){
            if(a[i]>=max1){
                max2= max1;
                max1=a[i];
            }
            else if(a[i]>max2){
                max2=a[i];
            }
        }
        System.out.print(max1 + " " +  max2);
    }
}
