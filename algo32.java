import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class algo32 {
    public int[] solution(int[] numbers) {
        
        HashSet<Integer> numSet = new HashSet<Integer>();
        
        for(int i = 0; i < numbers.length; i++){
            for(int j =0; j < numbers.length; j++){
                if( i != j)
                    numSet.add(numbers[i] + numbers[j]);
            }
        }
        ArrayList<Integer> numList = new ArrayList<>(numSet);
        
        int[] answer = new int[numList.size()];
        for(int i = 0; i< answer.length; i++){
            answer[i] = numList.get(i);
        }
        Arrays.sort(answer);
        
        
        return answer;
    }
}
