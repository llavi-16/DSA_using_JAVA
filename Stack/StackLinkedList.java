class StackLinkedList {
    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            next = null;
        }
    }
    static class Stack{
        private Node head;
        
        public boolean isEmpty() {
            return head == null;

        }

        public void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(3);
        st.push(2);
        st.push(1);
        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }
}