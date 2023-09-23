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

    public void Display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public DoublyLinkedList(){
        size = 0;
    }
    
    private class Node{
        int val;
        Node next;
        Node prev;
        public Node(int val,Node next,Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
        public Node(int val){
            this.val = val;
        }
    }
}