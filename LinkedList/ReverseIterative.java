class ReverseIterative{
    Node head;
    //private int size;

    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void printlist(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node pointer = head;
        while(pointer != null){
            System.out.print(pointer.data+"->");
            pointer = pointer.next;

        }
        System.out.println("NULL");

    }

    public void reverse(){
        if(head == null  || head.next == null){
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
        ReverseIterative list = new ReverseIterative();
        list.addFirst("list");
        list.addFirst("is");
        list.addFirst("this");
        list.printlist();
        list.reverse();
        list.printlist();

    }
}