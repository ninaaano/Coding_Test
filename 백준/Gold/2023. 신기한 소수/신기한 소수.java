import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        getResult(0,n);
        System.out.println(sb);
    }

    // temp는 맨 첫번째 자리수다...! append를 통해 뒤에 숫자가 더해진다
    private static void getResult(int temp, int n) {
        if(n == 0){
            if(isPrime(temp)) sb.append(temp).append("\n" );
            return;
        }

        for(int i=0;i<10;i++){
            int next = temp * 10 + i;
            if(isPrime(next)) getResult(next,n-1);
        }
    }

    public static boolean isPrime(int num){
        // 이게 없으면 자릿수 제대로 안나옴
        if(num < 2) return false;
        // 소수찾기
        for(int i = 2; i*i <= num; i++){
            if(num%i == 0)  return false;
        }
        return true;
    }

}
