public class algo25 {
     public long solution(long n) {
        long answer = 0;
        
        if(n % Math.sqrt(n) ==0){
           answer = (long)Math.sqrt(n)+1;
            answer = (long)Math.pow(answer, 2);
        }else
            answer = -1;
        return answer;
    }
}
