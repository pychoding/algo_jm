import java.util.Stack;

public class algo29 {
        public int solution(int n) {
        int answer = 0;
        int i = 0;
        
        Stack<Integer> st = new Stack<>();
        while(n > 0){
            st.push(n % 3);
            n /= 3;
        }
        while(!(st.isEmpty())){
            answer += st.pop() * (int)(Math.pow(3 , i));
            i++;
        }
        
        return answer;
    }
}
