// Time Complexity : O(n)
// Space Complexity : O(1)

import java.util.Arrays;

public class RemoveDuplicates_03 {
    public static int remove(int[] a){
        int i=0;
        for(int j=1;j<a.length;j++){
            if(a[i]!=a[j]){
                i++;
                a[i]=a[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int[] a={1,1,2,2,3};
        System.out.println(remove(a));
        System.out.println(Arrays.toString(a));
    }
}
