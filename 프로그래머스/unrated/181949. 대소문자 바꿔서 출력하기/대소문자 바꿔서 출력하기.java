import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] arr = a.toCharArray();
        for(int i=0; i<arr.length; i++){
            if(Character.isLowerCase(arr[i])) {
                arr[i] = Character.toUpperCase(arr[i]);
            } else {
                arr[i] = Character.toLowerCase(arr[i]);
            }
        }
        
        for(char c : arr) {
            System.out.print(c);
        }
    }
}