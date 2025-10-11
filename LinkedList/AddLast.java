class AddLast{
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    
    }

    public void addlast(String data){
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

    public void printlist(){
        if (head == null){
            System.out.println("list is empty");
            return;
        }
        Node pointer = head;
        while(pointer != null){
            System.out.print(pointer.data+("-> "));
            pointer = pointer.next;
        }
        System.out.println("null");
        
    }

    public static void main(String[] args){
        AddLast list = new AddLast();
        list.addlast("this");
        list.addlast("add");
        list.addlast("last");
        list.printlist();

    }
}