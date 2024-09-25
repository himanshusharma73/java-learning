package himanshu.coustomclass;

import java.util.Arrays;

public class MyArrayList<T> {
    private int size = 0;
    private final int DEFAULT_SIZE = 10;

    T[] list;

    MyArrayList(){
        list = (T[]) new Object[DEFAULT_SIZE];
    }

    public void add(T elements){
        if (size == list.length){
            copyList(list);
        }
        list[size++] =elements;
    }

    private void copyList(T[] list) {
        this.list= Arrays.copyOf(list, list.length + list.length/2);
    }

    public void print(){
        for (int i= 0; i<=size-1; i++){
            System.out.print(list[i]+", ");
        }
    }

    public T get(int index){
        if (index<0 || index > size-1){
            throw new IndexOutOfBoundsException("Index: " +index+", size: "+size);
        }
        return list[index];
    }

    public T remove(int index) {
        if (index< 0 || index >size-1){
            throw new IndexOutOfBoundsException("Index: " +index+", size: "+size);
        }
        T elementToBeRemoved = list[index];

        for (int i = index;i<=size-1;i++){
            list[i]=list[i+1];
        }
        list[--size] = null;
        return elementToBeRemoved;
    }

    public int size() {
        return size;
    }
}

class Main{
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(30);
        myArrayList.add(40);
        myArrayList.add(50);
        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(30);
        myArrayList.add(30);
        myArrayList.add(30);
        myArrayList.add(30);
        myArrayList.add(30);
        myArrayList.add(30);
        myArrayList.add(40);
        myArrayList.add(50);
        myArrayList.add(50);
        myArrayList.add(600);
        myArrayList.add(600);
        myArrayList.add(600);
        myArrayList.add(600);
        myArrayList.add(600);
        myArrayList.add(600);
        myArrayList.add(600);
        myArrayList.add(600);
        myArrayList.add(600);


        myArrayList.print();

        System.out.println("\nElement at index 10 is "+myArrayList.get(10));

        System.out.println("\nRemoved element "+myArrayList.remove(3));
        myArrayList.print();

        System.out.println("\nRemoved element "+myArrayList.remove(9));
        myArrayList.print();

        System.out.println("\nsize is: "+myArrayList.size());
    }

}
