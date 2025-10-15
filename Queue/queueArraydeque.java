import java.util.*;
class queueArraydeque{
    public static void main(String[] args){
        Queue<Integer> q = new ArrayDeque<>();
        q.add(9);
        q.add(8);
        q.add(7);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}