// Time Complexity : O(n)
// Space Complexity : O(1)

public class ArraySortedOrNot_04 {
    public static Boolean checkArray(int[] a){
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>a[(i+1)%a.length]){
                count++;
            }
        }
        if(count<=1){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        // int[] a={3,4,5,1,2};
        int[] a={2,1,3,4};
        System.out.println( checkArray(a));
    }
}
