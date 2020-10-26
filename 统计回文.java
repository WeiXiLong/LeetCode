import java.util.Scanner;
public class Main{
    private static int COUNT;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        String B = scanner.next();
        
        int i = isHuiWen(A,B);
        System.out.println(i);
    }
    
    private static int isHuiWen(String A,String B){
        if(A == null || B == null ){
            return -1;
        }
        int i = 0;
        for(; i <= A.length(); i++){
            StringBuilder sb1 = new StringBuilder(A);
            sb1.insert(i,B);
            int j = 0;
            for(; j < sb1.length() / 2;j++){
                if(sb1.charAt(j) != sb1.charAt(sb1.length() - j - 1)){
                    break;
                }
            }
            if(j == sb1.length() / 2){
                COUNT++;
            }
        }
        return COUNT;
    }
}