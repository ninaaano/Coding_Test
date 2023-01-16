import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static boolean[] visited; // 방문 배열
    static ArrayList<Integer>[] A; // 인접 리스트

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        visited = new boolean[n+1];
        A = new ArrayList[n+1]; // 실제로 모든 객체를 생성한 건 아님. 시작점만 있음

        for(int i=1; i<=n; i++){
            A[i] = new ArrayList<>();
        }

        // 엣지 갯수 만큼 데이터 저장하기
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e);
            A[e].add(s);
        }

        int count = 0;

        for(int i=1; i<=n; i++){
            if(!visited[i]){
                count++;
                DFS(i);
            }
        }
        System.out.println(count);
    }

    private static void DFS(int i) {
        if(visited[i]) return;
        visited[i] = true;
        for(int x : A[i]){
            if(!visited[x]) {
                DFS(x);
            }
        }
    }
}
