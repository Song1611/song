import java.util.*;
public class tongTraiPhaiNgto {
    public static boolean ngto(int n ){
        if(n<2)
            return false;
        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum=0;
        for(int i = 0 ;i<n;i++){
            a[i]= sc.nextInt();
            sum+=a[i];
        }
        int sum_left = a[0];
        for(int j = 1;j<n-1;j++){
            int sum_right=sum-sum_left-a[j];
            if(ngto(sum_right)&&ngto(sum_right)){
                System.out.print(j+ " ");
            }
            sum_left+=a[j];
        }
    }
}
