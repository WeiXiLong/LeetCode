import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();
            String str = sc.next();
            int row = (num + 1) / 2;
            int col = num;
            
            for(int i = 0; i < row; ++i){
                for(int j = 0; j < col; ++j){
                    if(i == 0 || i == row - 1){
                        System.out.print(str);
                    }else{
                         if(j == 0 || j == col - 1){
                             System.out.print(str);
                         }else{
                             System.out.print(" ");
                         }
                    }
                }
                System.out.println();
            }
        }
    }
}