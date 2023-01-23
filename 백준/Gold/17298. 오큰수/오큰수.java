import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] ans = new int[n];
        String[] str = br.readLine().split(" ");
        for(int i = 0; i<n; i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        Stack<Integer> stack = new Stack<>();
        // 처음에는 스택이 항상 비어있으니까 최초 값을 push해서 초기화한다
        stack.push(0);
        for(int i=1; i<n; i++){
            // 스택이 비어 있지 않고 현재 수열이 스택 top 인덱스가 가리키는 수열보다 클 경우
            while(!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                ans[stack.pop()] = arr[i]; // 정답 배열에 오큰수를 현재 수열로 저장
            }
            stack.push(i);
        }
        while(!stack.empty()){
            // 반복문 다 돌았는데 스택이 비어 있지 않다면 빌 때까지
            ans[stack.pop()] = -1; // 스택에 남아있는 index에 -1 넣기
        }
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++){
            sb.append(ans[i]).append(" ");
        }
        System.out.println(sb);
    }
}
