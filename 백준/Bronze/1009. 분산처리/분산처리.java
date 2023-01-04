import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 가장 마지막에 데이터를 처리하는 컴퓨터의 번호를 반환한다
 * 규칙을 보면 데이터를 처리하는 컴퓨터의 번호는 데이터의 1의 자릿수가 가진 값과 동일하다
 * 즉, 235465번째 데이터는 5번 컴퓨터가 처리한다. 1의 자릿수가 5기 때문에
 * 주어진 데이터 번호에서 1의 자릿수를 추출한다. 컴퓨터의 갯수는 10으로 고정된다
 * 데이터의 번호를 10으로 나누면 1의 자리가 남기때문에 이를 활용한다
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        // 공백을 기준으로 분리하여 배열에 담아준다
        for (int i = 0; i < T; i++) {
            String[] temp = br.readLine().split(" ");

            int a = Integer.parseInt(temp[0]);
            int b = Integer.parseInt(temp[1]);

            int result = 1; // 일의 자릿수만 보기 때문에 1로 정해준다
            // b는 제곱수. 제곱수 만큼 반복한다.
            for (int j = 1; j <= b; j++) {
                result = result * a % 10;
            }
            // 0일 경우 10으로 처리한다
            if (result == 0) result = 10;

            System.out.println(result);
        }
        br.close();
    }
}
