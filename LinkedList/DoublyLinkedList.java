public class DoublyLinkedList{

    private Node head;
    private Node tail;
    private int size;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;   
        }
        head = node; 
        size++;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;
        node.next = null;
        if(head == null){
            node.prev = null;
            head = node;
            return;
        }
        while(last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;  
        }      
    

    public void Display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void displayRev(){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        while(temp != null){
            System.out.print(temp.value + " <- ");
            temp = temp.prev;
        }
        System.out.println("Start");
    }

    public DoublyLinkedList(){
        size = 0;
    }
    
    private class Node{
        int value;
        Node next;
        Node prev;
        public Node(int val,Node next,Node prev){
            this.value = val;
            this.next = next;
            this.prev = prev;
        }
        public Node(int val){
            this.value = val;
        }
    }
}