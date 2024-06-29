package himanshu.collection.list;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(60);
        list.add(40);
        list.set(0,80);
        list.add(0,25);
        list.addFirst(35);
        System.out.println(list);
    }
}
