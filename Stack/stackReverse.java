import java.util.*;
class stackReverse{
    public static void bottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        bottom(s, data);
        s.push(top);
    }
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);
        bottom(s,top);

    }
    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);
        reverse(s);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}