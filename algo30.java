public class algo30 {
     public int solution(int[][] sizes) {
         int width =0;
         int length = 0;
        
        // 가로 세로 (긴 값을 가로)(짧은 값을 세로) = 그곳에서 최댓값 구하기
        
        for(int i = 0; i < sizes.length; i ++){
            if(sizes[i][0] < sizes[i][1]){
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
            if(width < sizes[i][0])
                width = sizes[i][0];
            if(length < sizes[i][1])
                length = sizes[i][1];
        }
        return width * length;
    }
}
