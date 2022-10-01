import java.util.*;

public class Main{
    public static void main(String[] args){
        int[] arr = new int[6];
        int count;
        int[] arr1 = {1,1,2,2,2,8};
        
        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i<arr1.length; i++){
            count = sc.nextInt();
            arr[i] = arr1[i]-count;
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}