public class RotateArrayRight_06 {
    public static void reverse(int s,int e,int[] a){
        while(s<=e){
            int temp=a[s];
            a[s]=a[e];
            a[e]=temp;
            s++;
            e--;
        }
       
    }
    public static void display(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args){
        int[] a={5,6,7,1,2,3,4};
        int k=3;
        int n=a.length;
        k=k%n;
        reverse(0,k-1,a);
        reverse(k,a.length-1,a);
        reverse(0,a.length-1,a);
        display(a);
    }
}
