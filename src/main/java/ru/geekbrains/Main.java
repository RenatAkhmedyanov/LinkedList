package ru.geekbrains;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(1);
        linkedList.addFirst(20);
        linkedList.addFirst(11);
        linkedList.addFirst(34);

        linkedList.addLast(55);
        linkedList.addLast(31);
        linkedList.addLast(39);
        System.out.print("Исходный список: ");
        linkedList.printList();

        linkedList.revert();
        System.out.print("Развернутый список: ");
        linkedList.printList();

        System.out.println("Введите, какое число с конца необходимо найти: ");
        Scanner scn = new Scanner(System.in);
        int index = scn.nextInt();
        System.out.println("Искомое число: " + linkedList.getNumberFromEnd(index));

    }



}
