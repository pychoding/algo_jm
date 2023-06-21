public class algo8 {
        public double solution(int[] arr) {
        double answer = 0;
        
        for(int i: arr){
            answer += (double)i/arr.length;
        }
        return answer;
    }
}
