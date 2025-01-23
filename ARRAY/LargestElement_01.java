// Time Complexity : O(n)
// Space Complexity : O(1)

import java.lang.reflect.Array;
import java.util.Arrays;

public class LargestElement_01{
    public static int findLargest(int[] a){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] a = {1,5,2,8,4,2};
        findLargest(a);
        System.out.println(findLargest(a));

    }
}