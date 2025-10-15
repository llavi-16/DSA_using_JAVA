import java.util.*;
class StackArray{
    static class stack{
        static ArrayList<Integer> arr = new ArrayList<>();
        public boolean isempty(){
            return arr.isEmpty();
        }
        public void push(int data){
            arr.add(data);
        }
        public int pop(){
            if(isempty()){
                return -1;
            }
            int top = arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            return top;

        }
        public int peek(){
            if(isempty()){
                return -1;
            }
            return arr.get(arr.size()-1);
        }
    }
    public static void main(String[] args){
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isempty()){
            System.out.println(s.peek());
            s.pop();
        }
    }

}