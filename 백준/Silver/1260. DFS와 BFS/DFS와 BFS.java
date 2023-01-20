
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static ArrayList<Integer>[] arr;
    static boolean[] visited;
    static StringBuilder sb;
    static Queue<Integer> queue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        arr = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            arr[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            arr[s].add(e);
            arr[e].add(s);
        }

        for(int i = 1; i<arr.length; i++){
            Collections.sort(arr[i]);
        }

        DFS(v);
        visited = new boolean[n+1];
        sb.append("\n");
        BFS(v);

        System.out.println(sb);
    }

    private static void BFS(int v) {
        visited[v] = true;
        queue = new LinkedList<>();
        queue.add(v);

        while(!queue.isEmpty()){
            int temp = queue.poll();
            sb.append(temp+" ");
            for(int i : arr[temp]){
                if(!visited[i]){
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    private static void DFS(int i) {
        visited[i] = true;
        sb.append(i + " "); // 현재 방문값 저장
        for(int j : arr[i]){
            if(!visited[j]){
                DFS(j);
            }
        }
    }
}
