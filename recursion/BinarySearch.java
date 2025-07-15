public class BinarySearch{
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = 5;
        int result = bs(arr, n, 0, arr.length - 1);
        System.out.println("Element found at index: " + result);
    }
    public static int bs(int[] arr, int n,int s, int e){
        if(s>e){
            return -1;
        }
        int m = s+(e-s) / 2;
        if(arr[m] == n){
            return m;
        }
        if(arr[m] < n){
            return bs(arr, n, m + 1, e);
        } else {
            return bs(arr, n, s, m - 1);
        }
    }
}