public class algo16 {
     boolean solution(String s) {
        boolean answer = true;
    int count = 0;
        s = s.toUpperCase();
        char[] chars = s.toCharArray();

        for (char aChar : chars) {
            if (aChar == 'P') {
                count++;
            } else if (aChar == 'Y') {
                count--;
            }
        }
        return count == 0;
    }
}
