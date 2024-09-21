import java.util.*;
public class mangFibo {
    public static boolean check(long[] fibo, long x){
        for(int i = 1;i<=93;i++){
            if(fibo[i]==x) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        long[] a = new long[n];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextLong();
        }
        long[] fibo = new long[93];
        fibo[1]=0;fibo[2]=1;
        for(int i = 3;i<=93;i++){
            fibo[i] = fibo[i-1]+fibo[i-2];
        }
        boolean search = false;
        for(int i = 0;i<n;i++){
            if(check(fibo,a[i])){
                System.out.println(a[i]);
                search = true;
            }
        }
        if(!search) System.out.println("NONE");
    }
}
