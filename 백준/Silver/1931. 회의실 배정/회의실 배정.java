
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Node implements Comparable<Node>{
    int start;
    int end;

    public Node(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Node o) {
        // 끝나는 시간이 같다면 시작 시간 기준으로 오름차순
        if(this.end == o.end) {
            return this.start - o.start;
        }else
            return this.end - o.end;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        ArrayList<Node> time = new ArrayList<>();

        StringTokenizer st;

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            time.add(new Node(s,e));
        }

        Collections.sort(time);

        int answer = 0;
        int prev_et = 0;

        for(Node i : time){
            if(i.start >= prev_et){
                answer++;
                prev_et = i.end;
            }
        }

        System.out.println(answer);

    }
}
