class Solution {
    public long solution(long n) {
        // Math.pow(숫자, 거듭제곱 횟수) => 숫자의 2승을 double로 반환해주기 때문에 (long)을 해준다
        // Math.sqrt(n) => n값의 제곱근을 'double'로 반환해준다
        long x = (long)Math.sqrt(n);
        if(n==Math.pow(x,2)){
            return (long)Math.pow(x+1,2);
        }else return -1;
    }
}