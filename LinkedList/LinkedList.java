class LinkedList{
    Node head;
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


    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node pointer = head;
        while(pointer != null){
            System.out.print(pointer.data+"->");
            pointer = pointer.next;
        }
        System.out.println("NULL");

    }


    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.addFirst("data");
        list.addFirst("is");
        list.printList();

    }
}