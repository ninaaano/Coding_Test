import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i< arr.length; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[i]=a+b;
        }
        for(int j : arr)
            System.out.println(j);
        sc.close();
    }
}