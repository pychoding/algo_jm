import java.util.ArrayList;

public class algo34 {
    public int[] solution(int[] answers) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
            
        int[] sum = {0, 0, 0};
        
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == arr1[i % 5])
                sum[0]++;
            if(answers[i] == arr2[i % 8])
                sum[1]++;
            if(answers[i] == arr3[i % 10])
                sum[2]++;
        }
        
        ArrayList<Integer> arrList = new ArrayList<>();
        int max = Math.max(Math.max(sum[0],sum[1]),sum[2]);
        
       for(int i=0; i<sum.length; i++){ 
           if(max == sum[i]) 
               arrList.add(i+1);
       }
        int[] answer = new int[arrList.size()];
        
        for(int i = 0; i < answer.length; i++){
          answer[i] =arrList.get(i);
        }

        return answer;
    }
}
