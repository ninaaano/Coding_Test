
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static StringTokenizer st;
    static StringBuilder sb;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int m = Integer.parseInt(br.readLine());

        Arrays.sort(arr);
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        for(int i=0; i<m; i++){
            if(Arrays.binarySearch(arr, Integer.parseInt(st.nextToken())) >= 0){
                sb.append(1).append('\n');
            }else{
                sb.append(0).append('\n');
            }
        }
        System.out.println(sb);
    }
}
