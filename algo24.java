public class algo24 {
    public long solution(long n) {
        long answer = 0;
        String str = Long.toString(n);
        String[] arr = str.split(""); 
        
        int[] iArr = new int[arr.length];
        
        for(int i = 0; i < iArr.length; i++){
            iArr[i] = Integer.parseInt(arr[iArr.length-i-1]);
        }
        
        
        for(int i = 0; i < iArr.length; i ++){
            int j =(int) Math.pow(10,i);
            int a = iArr[i];
            long sum = (long)j * a;
            answer = answer + sum;
        }
        
        return answer;
    }
}
