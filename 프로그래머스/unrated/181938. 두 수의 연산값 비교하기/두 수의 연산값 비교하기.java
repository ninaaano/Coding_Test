class Solution {
    public int solution(int a, int b) {
        String abs = Integer.toString(a)+Integer.toString(b);
        int ab = 2 * a * b;
        int absi = Integer.parseInt(abs);
        return ab > absi? ab : absi;
    }
}