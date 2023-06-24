import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MergeSort1 {
    public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
      System.out.println("Enter maxx size");
   int n=sc.nextInt();
     Random random=new Random();
        int[]a={35, 28, 71, 48, 12};
        System.out.println(Arrays.toString(a));
       int[] ans=mergeSort1(a);
        System.out.println(Arrays.toString(ans));
    }
    private static int[] mergeSort1(int[] a) {
        if(a.length==1){
            return a;
        }
        int mid=a.length/2;
        int[] left=mergeSort1(Arrays.copyOfRange(a,0,mid));
        int[] right=mergeSort1(Arrays.copyOfRange(a,mid,a.length));
        return merge1(left,right);
    }
    private static int[] merge1(int[] left, int[] right) {
        int ans[]=new int[left.length+right.length];
        int i=0,j=0,k=0;
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]){
                    ans[k]=left[i];
                    i++;
                    k++;
            }
            else{
                ans[k]=right[j];
                j++;
                k++;
            }
        }
        while(i<left.length){
            ans[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            ans[k]=right[j];
            j++;
            k++;
        }
        return ans;
    }
}
