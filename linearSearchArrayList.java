import java.util.*;
public class linearSearchArrayList {
    public static boolean linearSearch(ArrayList<Integer> arr,int n,int x){
        for(int i = 0;i<n;i++){
            if(x==arr.get(i))
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0;i<n;i++){
            int tmp = sc.nextInt();
            arr.add(tmp);
        }
        int x = sc.nextInt();
        if(linearSearch(arr,n,x)){
            System.out.println("yes");
        }
        else{
            System.out.println("none");
        }
    }
}
