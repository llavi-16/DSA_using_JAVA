import java.util.Arrays;
public class Merge {
    public static void main(String[] args){
        int[] arr = {52,57,515,54,51,2,4};
        int n = arr.length;
        divide(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void divide(int[] arr, int si, int ei){
        if(si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conquer(arr, si, mid,ei);
    }
    public static void conquer(int[] arr, int si, int mid, int ei){
        int[] mer = new int[ei-si+1];
        int x =0;
        int in1 = si;
        int in2 = mid+1;
        while(in1<=mid && in2<=ei){
            if(arr[in1]<arr[in2]){
                mer[x++]=arr[in1++];
            }else{
                mer[x++]= arr[in2++];
            }

        }
        while(in1<=mid){
            mer[x++]=arr[in1++];

        }
        while(in2<=ei){
            mer[x++]=arr[in2++];

        }
        for(int i =0, j=si;i<mer.length;i++,j++){
            arr[j]=mer[i];
        }
    }
    
}
