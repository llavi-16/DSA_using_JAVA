import java.util.*;
class stackPushAtBottom{
    public static void bottom(Stack<Integer> s , int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        bottom(s, data);
        s.push(top);
    }
    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);
        bottom(s, 4);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}