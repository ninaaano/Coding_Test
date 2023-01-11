import java.util.Scanner;
import java.util.Stack;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int num = 1;
        // while이랑 출력 if에 쓸 boolean 변수
        boolean answer = true;
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<n; i++){
            int arrNum = arr[i];
            if(arrNum >= num){
                while(arrNum>=num){
                    stack.push(num++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            }else {
                int temp = stack.pop();
                if(temp > arrNum){
                    System.out.println("NO");
                    answer = false;
                    break;
                }else{
                    sb.append("-\n");
                }
            }
        }
        if(answer) System.out.println(sb.toString());
    }
}
