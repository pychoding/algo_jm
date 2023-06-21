import java.util.LinkedList;
import java.util.Queue;

public class algo23 {
    public int[] solution(long n) {
        int i = 0;
        Queue<Integer> q = new LinkedList<>();

        while(n > 0){
            q.add((int)(n % 10));
                    //long type int overflow?
            // n % 10 == 0~9 ==> int;
            n =  n / 10;            
        }
        
        int[] answer = new int[q.size()];
        
        while(!(q.isEmpty())){
            answer[i] = q.poll();
            i++;
        }
        
        
        return answer;
}
}
