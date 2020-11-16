import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);
        String str = sca.next();
        
        int[] arr = new int[10];
        for(char ch : str.toCharArray()){
            arr[ch - '0']++;
        }
        
        for(int i = 0; i < arr.length; ++i){
            if(arr[i] != 0){
                System.out.println(i + ":" + arr[i]);
            }            
        }
    }
}