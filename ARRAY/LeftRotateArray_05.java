public class LeftRotateArray_05 {
    public static void rotate(int[] a){
        
        int i;
        int temp=a[0];
        // a[0]=temp;
        for(i=1;i<a.length;i++){
            a[i-1]=a[i];
        }
        a[a.length-1]=temp;
    }
    public static void display(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args){
        int[] a={1,2,3,4,5};
        display(a);
        rotate(a);
        display(a);
    }
}
