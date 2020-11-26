import java.util.*;
public class GrayCode {
    public String[] getGray(int n) {
        String[] resStrs;
        // write code here
        if(n == 1){
            resStrs = new  String[]{"0","1"};
        }else{
           String[] strs = getGray(n - 1);
            resStrs = new String[strs.length * 2];
            for(int i = 0; i < strs.length; ++i){
                resStrs[i] = "0" + strs[i];
                resStrs[resStrs.length - 1 - i] = "1" + strs[i];
            }
        }
        return resStrs;
    }
}