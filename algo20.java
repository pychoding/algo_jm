import java.util.Arrays;

public class algo20 {
       public String solution(String[] participant, String[] completion) {
        //completion의 길이는 participant의 길이보다 1 작습니다.== 미완주자 한명
        Arrays.sort(participant);
        Arrays.sort(completion);
        
           for(int i = 0; i < completion.length; i++) {
                 if(participant[i].equals(completion[i])) {
                continue;
        } else {
            return participant[i];
        }
    }

    return participant[participant.length-1];
        
    }
}
