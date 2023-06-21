import java.util.LinkedList;
import java.util.Queue;

public class algo26 {
    public int[] solution(int[] arr) {
        
        int[] answer1 = new int[arr.length-1];
        int[] answer2 = {-1};
        
        int min = arr[0];
        int i = 0;
        
        Queue<Integer> q = new LinkedList<>();
        
        for(int a : arr){
            q.add(a);
            if(min>a) 
	            min = a;
        }
        while(!q.isEmpty()){
            if(min != q.peek()){
            answer1[i] = q.poll();
            i++;
            }else
                q.poll();
        }
        
                
        return (arr.length >= 2) ? answer1 : answer2;
    }
}
