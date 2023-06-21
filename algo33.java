import java.util.ArrayList;
import java.util.List;

public class algo33 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
         List<Integer> numList = new ArrayList<>();
        for (int num : win_nums) {
            numList.add(num);
        }
            
        for(int lot : lottos){
            if(numList.contains(lot)){
                answer[0]++;
                answer[1]++;
            }
            if(lot == 0){
                answer[0]++;
            }
        }
        answer[0] =7 - answer[0];
        answer[1] =7 - answer[1];
        
        for(int i = 0; i < 2; i++){
            if(answer[i] == 0 || answer[i] == 7){
                answer[i] = 6;
            }
                
        }

        return answer;
    }
}
