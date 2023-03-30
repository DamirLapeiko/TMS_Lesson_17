package by.teachmeskills.lapeiko.homework18;

import java.util.Iterator;
import java.util.Scanner;

public class Homework18 {
    public static void main(String[] args) {
        IntArrayList arrayList = new IntArrayList();
        IntLinkedList linkedList = new IntLinkedList();
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                """
                        Choose task what you want to do with your list:
                        1. get
                        2. size
                        3. set
                        4. add
                        5. remove
                        6. lastIndexOf
                        7. Iterator"""
        );
        while (scanner.hasNextInt()) {
            int taskNumber = scanner.nextInt();
            switch (taskNumber) {
                case 1 -> {
                    int index = scanner.nextInt();
                    System.out.println("Your number in array list is: " + arrayList.get(index));
                    System.out.println("Your number in linked list is: " + linkedList.get(index));
                }
                case 2 -> {
                    System.out.print("Write index of any element: ");
                    int index = scanner.nextInt();
                    System.out.print("Write element: ");
                    int element = scanner.nextInt();
                    System.out.println("Your element in array list " + arrayList.set(index, element) +
                            " replaced by " + element);
                    System.out.println("Your element in linked list " + linkedList.set(index, element) +
                            " replaced by " + element);
                }
                case 3 -> {
                    System.out.println("Size of your array list is: " + arrayList.size());
                    System.out.println("Size of your linked list is: " + linkedList.size());
                }
                case 4 -> {
                    System.out.print("Write a number which you want to add: ");
                    int element = scanner.nextInt();
                    arrayList.add(element);
                    linkedList.add(element);
                }
                case 5 -> {
                    System.out.print("Write an index of number which you want to remove: ");
                    int index = scanner.nextInt();
                    System.out.println("Your element in array list " + arrayList.remove(index) +
                            " with index " + index + " was removed");
                    System.out.println("Your element in linked list " + linkedList.remove(index) +
                            " with index " + index + " was removed");
                }
                case 6 -> {
                    System.out.print("Write element which you want to verify: ");
                    int element = scanner.nextInt();
                    System.out.println("Last entry of this element (index) in array list is: " +
                            arrayList.lastIndexOf(element));
                    System.out.println("Last entry of this element (index) in linked list is: " +
                            linkedList.lastIndexOf(element));
                }
                case 7 -> {
                    demoIterator(arrayList);
                    demoIterator(linkedList);
                }
                default -> System.err.println("Task doesn't exist");
            }
            System.out.println("Array list: " + arrayList);
            System.out.println("Linked list: " + linkedList);

        }
    }

    private static void demoIterator(IntList list){
        for (Integer element : list){
            System.out.println(element + " ");
        }
        System.out.println();
    }
}
