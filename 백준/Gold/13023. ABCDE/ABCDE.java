
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static boolean isLine = false; // 방문 상태를 나타내는 boolean 변수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 사람의 수
        int m = Integer.parseInt(st.nextToken()); // 친구 관계의 수
        ArrayList<ArrayList<Integer>> arrList = new ArrayList<>(); // 인접리스트 선언

        for(int i=0; i<n; i++){
            arrList.add(new ArrayList<>()); // n의 갯수만큼 인접리스트 선언
        }

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arrList.get(a).add(b); // a의 정보를 가져와서 b의 정보를 넣어준다
            arrList.get(b).add(a); // 양방향으로 만들어서 연결해준다
        }
        boolean[] visited = new boolean[n]; // 방문 배열 선언
        for(int i=0; i<n; i++){
            //Arrays.fill(visited,false); // 근데 방문배열은 어차피 false로 초기화되어있는 것 아닌가?
            dfs(i,arrList,visited,1); // 1을 넣는 이유는 뭘까?
            if(isLine) { // dfs 돌고와서 false면 break?
                break;
            }
        }
        bw.write((isLine? 1:0) + "\n"); // 문제 조건에 맞는 A,B,C,D,E가 존재하면 1, 아니면 0. 개행안하면 이상한 문자 나옴
        bw.flush();
        bw.close();
        br.close();
    }

    private static void dfs(int start, ArrayList<ArrayList<Integer>> arrList, boolean[] visited, int cnt) {
        if(cnt == 5){ // n의 범위가 5부터 시작이다. n만큼 돌아가면 함수 종료
            isLine = true;
            return;
        }
        visited[start] = true; // 방문했으니 체크함
        for(int i : arrList.get(start)){
            if(!visited[i]){ // 방문하지 않았다면
                dfs(i,arrList,visited,cnt+1); // cnt를 증가 시켜서 재귀로 다시 돌아감
            }
            if(isLine){ // true가 되면 if문 종료
                return;
            }
        }
        visited[start] = false; // 일직선이 아닐 경우, 방문 배열 false 처리
    }
}
