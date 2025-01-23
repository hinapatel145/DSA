//?Time Complexity : O(n)
//?Space Complexity : O(1)

public class SecondLargestElement_02 {
    public static int findSecondLargestElement(int[] a){
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                secondMax=max;
                max=a[i];
            }
        }
        return secondMax;
    }
    public static void main(String[] args){
        int[] a = {7,3,6,1,8,3,9};
        System.out.println(findSecondLargestElement(a));
    }
}
