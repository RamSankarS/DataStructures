public class CircularLinkedList{

    private Node head;
    private Node tail;

    public CircularLinkedList(){
        this.head = null;
        this.tail = null;
    }

    public void insert(int val){
        Node node = new Node(val);
        if(head==null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void Display(){
        Node temp = head;
        if(head!=null){
            do{
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }while(temp != head);
        }
    }

    private class Node{
        int val;
        Node next;
        public Node(int val,Node next){
            this.val = val;
            this.next = next;
        }
        public Node(int val){
            this.val = val;
        }

    }

}