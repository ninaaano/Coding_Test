import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
            // 절댓값 힙 구현
            int first = Math.abs(o1);
            int second = Math.abs(o2);
            // 첫번째와 두번째 값이 같으면
            if(first == second) {
                return o1 > o2 ? 1 : -1; // 음수 우선 정렬
            } else
                return first - second; // 절댓값 기준 정렬
        });
        for(int i=0; i<n; i++){
            int answer = Integer.parseInt(br.readLine());
            if(answer == 0){
                if(pq.isEmpty()){
                    System.out.println("0");
                } else
                    System.out.println(pq.poll());
            }else {
                pq.add(answer);
            }
        }

    }
}
