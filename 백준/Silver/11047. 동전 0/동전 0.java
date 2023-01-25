import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 그리디 알고리즘
 * 동전찾기 문제는 가장 큰 가치를 지닌 동전부터 선택한다
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 동전 종류
        int k = Integer.parseInt(st.nextToken()); // 가지고 있는 돈

        int[] coin = new int[n];

        for (int i = 0; i < n; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;

        for (int i = n - 1; i >= 0; i--) { // i가 0보다 크거나 같을때까지 감소시킨다
            if(coin[i] <= k) {
                count += (k/coin[i]); // count에 동전을 나눈 값을 넣고
                k = k%coin[i]; // k에는 나머지 몫을 가지고 있게 한다
            }
        }

        System.out.println(count);

    }
}
