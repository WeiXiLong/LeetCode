import java.util.*;

public class Finder {
    public int findKth(int[] a, int n, int K) {
        bubbleSort(a,n);
        return a[n - K];
    }
    
    private void bubbleSort(int[] a,int n){
        for(int i = 0; i < n; ++i){
            for(int j = n - 1; j > i; j--){
                if(a[j] < a[j - 1]){
                    int tem = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = tem;
                }
            }
        }
    }
}