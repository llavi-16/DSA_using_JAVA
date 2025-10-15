class QueueLinkedlistt{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Queue{
        Node head = null;
        Node tail = null;

        public boolean isEmpty(){
            return head == null && tail == null;
        }

        public void add(int data){
            Node newNode = new Node(data);
            if(tail == null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public int remove(){
            if(isEmpty()){
                return -1;
            }
            int pointer  = head.data;
            if(head == tail){
                tail = null;
            }
            head = head.next;
            return pointer;
        }

        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
        
    }
    public static void main(String[] args){
        Queue q = new Queue();
        q.add(2);
        q.add(3);
        q.add(4);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}