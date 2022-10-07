import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int copy = n; // 처음 입력값을 복사한 변수
        int count = 0; // 반복문이 몇번 반복되었는지 세어주는 변수

        do { // while문이 최소 1번은 반복문을 돌아야하기 때문에 do-while문 사용
            n = ((n % 10) * 10) + (((n / 10) + (n % 10)) % 10);
            count++;
        }while(copy!=n);

        System.out.println(count);
        }
    }

