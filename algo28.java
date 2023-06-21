public class algo28 {
     public boolean solution(int x) {
        boolean answer = true;
        int n = 0;
        int y = x;
        while(x > 0){
            n += x % 10;
            x = x / 10;
        }
        
        return answer = (y % n == 0) ? true : false;

    }
}
