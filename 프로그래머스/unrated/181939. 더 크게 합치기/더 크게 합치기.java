class Solution {
    public int solution(int a, int b) {
        String as = Integer.toString(a);
        String bs = Integer.toString(b);
        
        String ab = as + bs;
        String ba = bs + as;
        
        return Integer.compare(Integer.parseInt(ab), Integer.parseInt(ba)) > 0 ? Integer.parseInt(ab) : Integer.parseInt(ba);

    }
}