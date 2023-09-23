public class Main {
    public static void main(String[] args) {
        LinkedList LL = new LinkedList();
        LL.insertFirst(3);
        LL.insertFirst(5);
        LL.insertFirst(6);
        LL.insertFirst(4);
        LL.insertLast(99);
        LL.insert(20, 2);
        LL.display();
        System.out.println(LL.deleteFirst());
        LL.display();
        System.out.println(LL.find(5));
    }
    
}
