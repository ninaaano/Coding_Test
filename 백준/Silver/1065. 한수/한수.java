import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        for(int i = 0; i<=n; i++){
            if(n<100){
                cnt = n;
            }else{
                cnt = 99;
                for(int j = 100; j<=n; j++) {
                    int a = j / 100; // 백의 자릿수
                    int b = (j / 10) % 10; // 십의 자릿수
                    int c = j % 10;
                    if ((a - b) == (b - c)) {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
