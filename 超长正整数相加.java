import java.util.*;
import java.math.BigInteger;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){
            String str1 = sc.next();
            String str2 = sc.next();
            
            BigInteger num1 = new BigInteger(str1);
            BigInteger num2 = new BigInteger(str2);
            System.out.println(num1.add(num2));
        }
    }
}