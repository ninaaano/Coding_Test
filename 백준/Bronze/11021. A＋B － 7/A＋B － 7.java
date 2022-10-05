import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()+" ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[i] = a+b;
            bw.write("Case #"+String.valueOf(i+1)+": "+String.valueOf(arr[i]));
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }
}