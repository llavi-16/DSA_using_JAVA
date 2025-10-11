class DelLast{
    Node head;
    private int size;
    DelLast(){
        this.size = 0;
    }
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
            size++;
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

    public void delLast(){
        if(head == null){
            System.out.println("Empty list");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node seclast = head ;
        Node last = head.next;
        while(last.next != null){
            last = last.next;
            seclast = seclast.next;
        }
        seclast.next = null;

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
        DelLast list = new DelLast();
        list.addFirst("data");
        list.addFirst("is");
        list.printList();
        System.out.println(list.size);
        list.delLast();
        list.printList();
        System.out.println(list.size);

    }
}