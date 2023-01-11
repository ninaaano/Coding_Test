import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class atmQueue implements Comparable<atmQueue> {
    int index; // 대기번호
    int time; // 대기 시간

    public atmQueue(int index, int time) {
        this.index = index;
        this.time = time;
    }


    @Override
    public int compareTo(atmQueue o) {
        return this.time - o.time; // 시간 오름차순
    }
}


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        atmQueue[] arr = new atmQueue[n];

        for(int i =0; i<n; i++){
            arr[i] = new atmQueue(i, Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(arr);

        int sum = 0;
        int total = 0;
        for(int i=0; i<n; i++){
            sum += arr[i].time;
            total += sum;
        }
        System.out.println(total);
    }
}
