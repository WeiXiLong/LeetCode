import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        
        if(str1 == null || str2 == null || str2.length() > str1.length()){
            return;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str1.length(); ++i){
            if(!str2.contains(str1.subSequence(i,i+1))){
                sb.append(str1.charAt(i));
            }
        }
        System.out.println(sb.toString());       
    }
}