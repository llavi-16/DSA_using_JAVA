import java.util.*;
class FindIntersection{
    public static void inter(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        for(int i:arr1){
            set.add(i);
        }
        int count =0;
        for(int i :arr2){
            if(set.contains(i)){
                System.out.println(i);
                count++;
                set.remove(i);
            }
        }
        System.out.println("count: "+count);
    }
    public static void main(String[] args){
        int[] arr1 = {7,3,9};
        int[] arr2 = {6,3,9,2,9,4};
        inter(arr1,arr2);
    }
}