import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // b는 별 갯수, a는 줄 갯수
        for(int i =0; i < b; i++){
            for(int j=0; j < a; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}