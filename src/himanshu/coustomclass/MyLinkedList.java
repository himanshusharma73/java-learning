package himanshu.coustomclass;

public class MyLinkedList<T> {

    private class Node {
        private T data;
        private Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }

    }

    private Node head;
    private int size;

    public void addAtLast(T data) {
        size++;
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void addAtFirst(T data) {
        size++;
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node tempHead = head;
            head = node;
            node.next = tempHead;
        }
    }

    public T removeFromFirst() {
        if (head == null) {
            throw new RuntimeException("Empty linked list can't remove more elements");
        }
        --size;
        Node node = head;
        T data = node.data;
        head = node.next;
        return data;
    }

    public T removeFromLast() {
        if (head == null) {
            throw new RuntimeException("Empty linked list can't remove more elements");
        }
        --size;
        Node temp = head;
        if (temp.next == null) {
            T data = head.data;
            head = null;
            return data;
        }
        while (temp.next.next != null) {
            temp = temp.next;
        }
        T data = temp.next.data;
        temp.next = null;
        return data;

    }

    public void addAtIndex(T data, int index){
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        } else if (index == 0){
            addAtFirst(data);
        } else if (index == size){
            addAtLast(data);
        } else {
            size++;
            Node newNode = new Node(data);
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public int size() {
        return size;
    }

    public void print() {
        Node node = head;
        if (node == null) {
            System.out.println("Empty linked list");
        }
        while (node != null) {
            System.out.print(node.data + ", ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.addAtLast("10");
        list.addAtLast("20");
        list.addAtLast("30");
        list.addAtLast("40");
        list.addAtLast("50");
        list.addAtLast("60");
        list.addAtLast("100");
        list.print();
        list.addAtFirst("70");
        list.addAtFirst("80");
        list.addAtFirst("90");
        System.out.println();
        list.print();

        System.out.println("\n\n");
        System.out.println("Element removed from first: " + list.removeFromFirst());
        System.out.println("Element removed from first: " + list.removeFromFirst());
        System.out.println("Element removed from first: " + list.removeFromFirst());
        System.out.println("Element removed from first: " + list.removeFromFirst());
        System.out.println("Size is: " + list.size);
        list.print();
        System.out.println("\n\n");
        System.out.println("Element removed from last: " + list.removeFromLast());
        System.out.println("Element removed from last: " + list.removeFromLast());
        list.print();

        System.out.println("\nSize is: " + list.size());

        list.addAtIndex("110",4);

        list.print();
    }
}
