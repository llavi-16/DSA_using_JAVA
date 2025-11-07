import java.util.*;
class Union{
    public static void Union(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        int count =0;
        for(int i=0; i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i =0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        for(int in:set){
            System.out.println(in);
            count++;
        }
        System.out.println("count : " +count);
    }
    public static void main(String[] args){
        int[] arr1 = {7,3,9};
        int[] arr2 = {6,9,3,2,9,4};
        Union(arr1,arr2);
    }
}