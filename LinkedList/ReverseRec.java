class ReverseRec{
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    public void Addlast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node pointer = head;
        while(pointer.next != null){
            pointer = pointer.next;
        }
        pointer.next = newNode;
    }
    public void printt(){
        if(head == null){
            System.out.println("list empty");
            return;
        }
        Node pointer = head;
        while(pointer != null){
            System.out.print(pointer.data +"->");
            pointer = pointer.next;
        }
        System.out.println("NULL");
    }
    public Node reverse(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;

        
    }
    public static void main(String[] args){
        ReverseRec li = new ReverseRec();
        li.Addlast("this");
        li.Addlast("is");
        li.Addlast("a");
        li.Addlast("list");
        li.printt();
        li.head =li.reverse(li.head);
        li.printt();
    }
}