import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 회의실 배정
 * 회의가 끝나는 시간을 기준으로 오름차순 정렬
 * 회의가 먼저 시작하는 걸 선택하면 중간에 시작하는 회의를 선택할 수 없다
 * 만약 끝나는 시간이 같다면 시작 시간을 오름차순 정렬 해야한다
 */

class Time implements Comparable<Time> {

    public int start, end;

    public Time(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Time o) {
        if (this.end == o.end) return this.start - o.start; // 오름차순
        else return this.end - o.end;
    }
}

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time> procedure = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            procedure.add(new Time(start, end));
        }
        System.out.println(T.solution(n, procedure));
    }

    private int solution(int n, ArrayList<Time> procedure) {
        int answer = 0;
        Collections.sort(procedure); // compareTo 기준에 의해 정렬
        int et = 0; // 현재 회의의 끝나는 시간
        for (Time object : procedure) {
            if (object.start >= et) { // 회의 가능
                answer++;
                et = object.end;
            }
        }
        return answer;
    }
}
