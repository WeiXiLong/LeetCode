 public static void count(int res,int num,int[] arr){
        if(res == 0){
            COUNT++;
            return;
        }
        if (res < 0 || (res > 0 && num < 1)){
            return;
        }
            count(res - arr[num],num - 1,arr);
            count(res,num - 1,arr);
        
    }
}