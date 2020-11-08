import java.util.Scanner;
public class Main{
    private static int COUNT;
   
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()){
            int num = scanner.nextInt();
            int[] arr = new int[num + 1];
            for(int i = 1; i <= num; i++){
                arr[i] = scanner.nextInt();
            }
            count(40,num,arr);
            System.out.println(COUNT);
        }
    }