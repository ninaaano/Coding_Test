import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 * BFS
 * 다익스트라
 */

public class Main {

    static ArrayList<Node>[] arr;
    static int[] visit;
    static PriorityQueue<Node> pq;
    static int N,M,K,X;

    private static class Node implements Comparable<Node>{
        int e; // 정점
        int cost; // 거리

        public Node(int e, int cost) {
            this.e = e;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node o) {
            return cost-o.cost;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); // 도시 개수
        M = Integer.parseInt(st.nextToken()); // 도로 개수
        K = Integer.parseInt(st.nextToken()); // 최단 거리
        X = Integer.parseInt(st.nextToken()); // 출발 도시

        arr = new ArrayList[N+1];
        visit = new int[N+1];
        Arrays.fill(visit, Integer.MAX_VALUE);


        for(int i=1; i<=N; i++){
            arr[i] = new ArrayList<>();
        }

        for(int i=0; i<M; i++){
            st=new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            arr[s].add(new Node(e,1));
        }

        visit[X] = 0; // 처음 방문이니까 0

        dijkstra();

        int answer = 0;

        for(int i =1; i<visit.length; i++){
            int distance = visit[i];
            if(distance == K){
                System.out.println(i);
                answer++;
            }
        }
        if(answer == 0) System.out.println(-1);
    }

    private static void dijkstra() {
        pq = new PriorityQueue<>();
        pq.add(new Node(X,0));

        while(!pq.isEmpty()){
            Node node = pq.poll();
            int v = node.e;
            int c = node.cost;
            if(visit[v] < c){
                continue;
            }
            for(int i=0; i< arr[v].size(); i++){
                int v2 = arr[v].get(i).e;
                int c2 = arr[v].get(i).cost + c;

                if(visit[v2]>c2){
                    visit[v2] = c2;
                    pq.add(new Node(v2,c2));
                }
            }
        }
    }
}
