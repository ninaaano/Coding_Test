import java.util.Scanner;

// baekjoon

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();

        int[] charArr = new int[26];

        for(int i=0; i<charArr.length; i++){
            charArr[i]= -1;
        }

        for(int i = 0; i<userInput.length(); i++){
            char c = userInput.charAt(i);

            if(charArr[c-97] == -1){
                charArr[c-97] = i;
            }
        }
        for (int index : charArr){
            System.out.print(index+" ");
        }

    }
}
