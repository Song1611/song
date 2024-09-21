import java.util.*;
public class veHinhTamGiacCan {
    public static void veTamGiacCanTren(int n){
        for(int i = 1;i<=n;i++){
            for(int j=1;j<n+1-i;j++){
                System.out.print(" ");
            }
            for(int k=n+1-i;k<=n+i-1;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void veTamGiacCanSo(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<n-i+1;j++){
                System.out.print("  ");
            }
            int d = i;
            for(int k = n-i+1;k<n;k++ ){
                System.out.print( d+ " ");
                d++;
            }
            for(int l=n;l<=i+n-1;l++ ){
                System.out.print(d+ " ");
                d--;
            }
            System.out.println("");
        }
    }
    public static void veTamGiacDuoi(int n){
        int d = 1,c=2*n-1;
     for(int i = 1;i<=n;i++){
         for(int j = 1;j<d;j++){
             System.out.print("  ");
         }
         for(int k = d;k<=c;k++){
             System.out.print("* ");
         }
         c--;
         d++;
         System.out.println("");
     }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        veTamGiacCanTren(n);
        veTamGiacCanSo(n);
        veTamGiacDuoi(n);
    }
}
