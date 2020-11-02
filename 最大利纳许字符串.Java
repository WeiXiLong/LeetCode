import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int max = -1;
        String str = scanner.next();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            int count = 0;
            int index = i;
            while(i != str.length() && str.charAt(i) - '0' >= 0 && str.charAt(i) - '0' < 10){
                count++;
                i++;
            }
            if(count > max){
                max = count;
                sb = new StringBuilder(str.substring(index,i));
            }
        }
        System.out.println(sb.toString());
    }
}