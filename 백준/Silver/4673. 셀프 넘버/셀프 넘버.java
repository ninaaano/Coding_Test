public class Main {
    public static void main(String[] args) {
        boolean[] check = new boolean[10000];

        for (int i = 1; i < 10001; i++) {
            int num = i;
            int sum = i;
            while (num != 0) {
                sum +=(num % 10); // 첫째 자리수
                num = num / 10; // 10을 나눠서 첫 째 자리 없애기
            }
            if(sum < check.length){
                check[sum] = true;
            }
        }
        for(int j=1; j<check.length; j++){
            if(check[j]==true)
                continue;
            System.out.println(j);
        }
    }
}
