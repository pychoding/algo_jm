import java.util.Scanner;

public class algo1{
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String str = "*";
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < a; i++){
            sb.append(str);
        }
        for(int i = 0; i < b; i++){
            System.out.println(sb);
        }
    }
}