import java.util.PriorityQueue;

public class algo14 {
       public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int i = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int a : arr){
            if( a % divisor == 0)
                pq.add(a);
        }
        if(pq.isEmpty()){
            answer = new int[1];
            answer[0] = -1;
        }else{
        answer = new int[pq.size()];
        while(!(pq.isEmpty())){
            answer[i] = pq.poll();
            i++;
        }
        }

        return answer;
}
