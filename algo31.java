import java.util.LinkedList;
import java.util.Queue;

public class algo31 {
        public int[] solution(int []arr) {
        int j = 0;
        
        Queue<Integer> que = new LinkedList<>();
        
         que.add(arr[0]);
        for(int i = 0; i <arr.length-1; i++){
            if(arr[i] != arr[i+1])
                que.add(arr[i+1]);
        }
        int[] answer = new int[que.size()];
        while(!(que.isEmpty())){
            answer[j] = que.poll();
            j++;
            
        }
        return answer;
    }
}
