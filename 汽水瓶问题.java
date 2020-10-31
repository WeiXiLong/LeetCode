import java.util.Scanner;
public class Main{
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
           while(scanner.hasNextInt()){
            int num = scanner.nextInt();
            if(num == 0){
                break;
            }
            int drinkNum = 0;
            int count = 0;
            while(true){
                if(num < 2){
                    break;
                }
                if(num == 2){
                    count++;
                    break;
                }
                drinkNum = num / 3;
                num = num % 3 + drinkNum;
                count += drinkNum;
            }
            System.out.println(count);
        }
    }
}