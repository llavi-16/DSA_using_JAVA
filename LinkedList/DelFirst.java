class DelFirst{
    Node head;
    private int size;
    DelFirst(){
        this.size =0;
    }
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
            size ++;
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

    public void delFirst(){
        if(head == null){
            System.out.println("Empty list");
            return;
        }
        size--;
        head = head.next;

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
        DelFirst list = new DelFirst();
        list.addFirst("data");
        list.addFirst("is");
        list.printList();
        System.out.println(list.size);
        list.delFirst();
        list.printList();
        System.out.println(list.size);

    }
}