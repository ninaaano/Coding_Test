import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int TestCase = sc.nextInt();

        for(int i=0; i<TestCase; i++){
            int n = sc.nextInt(); // 학생의 수
            int[] arr = new int[n];

            double sum = 0;

            for(int j=0; j<arr.length; j++){
                arr[j] = sc.nextInt(); // 성적입력
                sum+=arr[j]; // 입력한 합을 더해준다
            }

            double avg = (sum/n); // 평균
            double cnt = 0; // 평균을 넘는 학생
            double cntavg = 0;

            // 평균을 넘는 학생들의 비율?
            for(int k=0; k< arr.length; k++){
                if(arr[k]>avg){ // 평균보다 높다면?
                    cnt++; // cnt에 추가
                }
                cntavg = (cnt/n)*100; // 평균 이상 학생들의 평균
            }

            System.out.println(String.format("%.3f",cntavg)+"%");

        }
        sc.close();
    }
}
