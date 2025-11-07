class practice{
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addfirst(int data){
        Node newn = new Node(data);
        // if(isEmpty()){
        //     head = newn;
        // }
        newn.next = head;
        head = newn;
    }

    public void addlast(int data){
        Node newn = new Node(data);
            if(isEmpty()){
                head = newn;
        }
        Node pointer = head;
        while(pointer.next != null){
            pointer = pointer.next;
            
        }
        pointer.next = newn;
    }

    public int removefirst(){
        if(isEmpty()){
            return -1;
        }
        int front = head.data;
        head = head.next;
        return front;

    }

    public int removelast(){
    if(isEmpty()) return -1;

    if(head.next == null){   // only one node
        int val = head.data;
        head = null;
        return val;
    }

    Node pointer = head;
    while(pointer.next.next != null){ // go to second last
        pointer = pointer.next;
    }
    int val = pointer.next.data;
    pointer.next = null;
    return val;
}


    public void printt(){
        if(isEmpty()){
            System.out.println("list empty");
        }
        Node pointer = head;
        while(pointer != null){
            System.out.print(pointer.data +"->");
            pointer = pointer.next;

        }
        System.out.println("NULL");

    }

    public void reverse(){
        if(isEmpty() || head.next == null){
            return;
        }
        Node prev = head;
        Node curr = head.next;
        while(curr != null){
            Node nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
        }
        head.next = null;
        head = prev;
    }

    public static void main(String[] args){
        practice list = new practice();
        list.addfirst(4);
        list.addfirst(2);
        list.addfirst(5);
        list.addlast(1);
        list.addlast(7);
        list.addlast(0);
        list.removefirst();
        list.removelast();
        list.printt();
        list.reverse();
        list.printt();
    }
}