public class algo3 {
       public String solution(String s) {
        String answer = "";
        int num = s.length()/2-1;
        
        if(s.length() % 2 == 0){
            answer = s.substring(num , num+2);
        }else{
            answer = s.substring(num+1 ,num+2);
        }
        return answer;
    } 
}
