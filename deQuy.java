import java.util.*;
public class deQuy {
    public static int gt(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*gt(n-1);
        }
    }
    public static int tong(int n){
        if(n==0){
            return 0;
        }
        else{
            return n+tong(n-1);
        }
    }
    public static int tongBinh(int n){
        if(n==1){
            return 1;
        }
        else{
            return n*n+tongBinh(n-1);
        }
    }
    public static int xenKe(int n ){
        if(n==1){
            return -1;
        }
        if(n%2==0){
            return -n + xenKe(n-1);
        }
        return n+xenKe(n)-1;

    }
    public static int fibo(int n ){
        if(n==1) return 0;
        if(n==2) return 1;
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(tong(n));
        System.out.println(gt(n));
        System.out.println(tongBinh(n));
    }
}
