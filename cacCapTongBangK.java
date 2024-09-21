import java.util.*;
public class cacCapTongBangK {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] d = new int[1001];
        for(int i =0 ;i<n;i++){
            a[i] = sc.nextInt();
            d[a[i]]++;
        }
        int dem = 0;
        int k = sc.nextInt();
        for(int value=0;value<=k/2;value++){
            int y = k - value ;
            if(y!=value) dem+=d[y]*d[value];
            else dem+= (d[value]*(d[value]-1))/2;
        }
        System.out.println(dem);
    }
}
