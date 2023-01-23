import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 이분 탐색. 최솟값 찾기
 */
public class Main {
    static int n;
    static int m;
    static int min;
    static int max;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            max += arr[i];
            min = Math.max(min, arr[i]);
        }
        System.out.println(BinarySearch(arr));
    }

    private static int BinarySearch(int[] arr) {
        int lo = min;
        int hi = max; // 배열 값을 모두 더한 값

        while(lo<=hi){
            int mid = (lo+hi)/2;
            int sum = 0;
            int count = 1;

            for(int i = 0; i<n; i++){
                if(sum+arr[i] <= mid){
                    sum+=arr[i];
                }else{
                    sum = arr[i];
                    count++;
                }
            }

            if(count <= m){
                hi = mid -1;
            }else
                lo = mid+1;
        }
        return lo;
    }
}
