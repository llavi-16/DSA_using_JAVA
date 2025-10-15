class CircularQueueArray{
    static class Queue{
        int[] arr;
        int front;
        int rear;
        int size;
        Queue(int n){
            arr = new int[n];
            front =-1;
            rear =-1;
            this.size =n;
        }
        public boolean isEmpty(){
            return rear == -1 && front ==-1;
        }
        public boolean isFull(){
            return (rear+1)%size == front;
        }
        public void add(int data){
            if(isFull()){
                System.out.println("queue is full");
                return;
            }
            if(front ==-1){
                front =0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }
        public int remove(){
            if(isEmpty()){
                return -1;
            }
            int res = arr[front];
            if(front == rear){
                front = rear =-1;
            }else{
                front = (front+1)%size;
            }
            return res;

        }
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args){
        Queue q = new Queue(4);
        q.add(5);
        q.add(6);
        q.add(1);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }    
}