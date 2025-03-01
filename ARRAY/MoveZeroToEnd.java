import java.util.Arrays;

public class MoveZeroToEnd {
    public static void moveZero(int[] a){
        int i=0,j=a.length-1;
        while(i<j){
            while(a[i]!=0){
                i++;
            }
            while(a[j]==0){
                j--;
            }
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;j--;
        }
    }
    public static void main(String[] args){
        int[] a={0,1,0,3,12};
        moveZero(a);
        System.out.print(Arrays.toString(a));
    }
}
