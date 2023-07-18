import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] strArr = a.split("");
        for(String b : strArr) {
            System.out.println(b);
        }
    }
}