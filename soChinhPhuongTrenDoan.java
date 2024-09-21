import java.util.*;
public class soChinhPhuongTrenDoan {
    public static boolean cp(int n ){
        int can = (int)Math.sqrt(n);
        return (int)can * can == n;
    }
//    A && B && C
//    1. thời gian xử lí hàm
//    2. dễ sai
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        int l = (int)Math.sqrt(a);
        if(!cp(l)){
            l++;
        }
        int R = (int)Math.sqrt(b);
        for(int i = l ;i<=R;i++) {
            System.out.println(i * i);
        }
    }
}
