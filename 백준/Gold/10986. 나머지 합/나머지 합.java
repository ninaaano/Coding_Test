import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        long[] arr = new long[n];
        long[] arr1 = new long[m];
        long answer = 0;

        arr[0] = sc.nextInt();

        for(int i=1; i<n; i++){
            arr[i] = arr[i-1] + sc.nextInt();
        }

        for(int i=0; i<n; i++){
            int temp = (int)(arr[i] % m);
            if(temp == 0) answer++;
            arr1[temp]++;
        }

        for(int i=0; i<m; i++){
            if(arr1[i]>1){
                //answer += ((arr1[i] * arr1[i]-1) / 2);
                answer = answer + (arr1[i] * (arr1[i]-1))/2;
            }
        }
        System.out.println(answer);
    }
}
