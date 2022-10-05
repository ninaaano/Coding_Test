import java.util.*;

public class Main{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int count = sc.nextInt();
        int[] arr = new int[count];
        int arrsum = 0;

        for(int i=0; i<arr.length; i++){
            int cost = sc.nextInt();
            int ea = sc.nextInt();
            arr[i] = cost*ea;
            arrsum += arr[i];
        }

        if(sum == arrsum){
            System.out.println("Yes");
        }else
            System.out.println("No");

        sc.close();
    }
}