
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        int count = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (arr[i] <= 0) {
                count++;
            }
        }

        Arrays.sort(arr);

        int answer = 0;


        for (int i = 1; i < count; i += 2) {
            answer +=  (arr[i - 1] * arr[i]);
        }

        if (count % 2 == 1) {
            answer += arr[count - 1];
        }

        if ((n - count) % 2 == 1) {
            answer += arr[count];
        }

        for (int i = n - 1; i > count; i -= 2) {
            int mul = arr[i] * arr[i - 1];
            int sum = arr[i] + arr[i - 1];
            if (mul > sum) {
                answer += mul;
            } else
                answer += sum;
        }

        System.out.println(answer);


    }
}
