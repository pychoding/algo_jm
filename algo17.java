public class algo17 {
     public boolean solution(String s) {
        boolean answer = true;
        
        if(!(s.length() == 4 || s.length() ==6) ){
            answer = false;
        }
        char[] chArr = s.toCharArray();
        
        for(char a : chArr){
            if(!(Character.isDigit(a)))
                answer = false;
            
        }
        return answer;
    }
}
