import java.util.*;
public class phantichcacthuasonguyento {
    public static void pt(int n){
        for(int i =2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                while(n%i==0){
                    System.out.print(i+ " ");
                    n/=i;
                }
            }
        }
        if(n>1)
            System.out.print(n);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pt(n);
    }
}
