import java.util.*;

public class AntiOrder {
    public int count(int[] A, int n) {
        int count = 0;
        for(int i = A.length - 1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(A[j] > A[i]){
                    count++;
                }
            }
        }
        return count;
    }
}