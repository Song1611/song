import java.util.*;
public class kiemtracacso {
    public static int soUocNguyenTo(int n){
        int sum=0;
        for(int i =2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                sum++;
               while(n%i==0)
                   n/=i;
            }
        }
        if(n>1){
            sum++;
        }
        return sum;
    }
    public static int latNguoc(int n){
        int tmp=0;
        while(n!=0){
            tmp = tmp * 10 +  n%10;
            n/=10;
        }
        return tmp;
    }
    public static int sumNgTo(int n){
        int tong=0;
        while(n!=0){
            int tmp = n%10;
            if(ngto(tmp)){
                tong+=tmp;
            }
            n/=10;
        }
        return tong;
    }
    public static int sumC(int n){
        int tong=0;
        while(n!=0){
            int tmp = n%10;
            if(tmp%2==0){
                tong+=tmp;
            }
            n/=10;
        }
        return tong;
    }
    public static boolean ngto(int n ){
        if(n<2){
            return false;
        }
        for(int i =2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static int uocNguyenToMax(int n){
        int res =0;
        for(int i =2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                res=i;
                while(n%i==0){
                    n/=i;
                }
            }
        }
        if(n>1){
            res=n;
        }
        return res;
    }
    public static boolean toanSo(int n){
        int tmp=n%10;
        n/=10;
        while(n!=0){
            int res=n%10;
            if(tmp!=res){
                return false;
            }
            n/=10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        if(ngto(n)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        System.out.println(sumC(n));
        System.out.println(sumNgTo(n));
        System.out.println(latNguoc(n));
        System.out.println(soUocNguyenTo(n));
        System.out.println(uocNguyenToMax(n));
        System.out.println(toanSo(n));
    }
}
