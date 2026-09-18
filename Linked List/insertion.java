
import java.util.Scanner;

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class insertion {

    Node head;

    void insertAtPos(int data, int pos) {

        Node newNode = new Node(data);

        if (pos == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;

        for (int i = 1; i < pos - 1; i++) {

            if (temp == null) {
                System.out.println("Invalid position");
                return;
            }

            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        insertion list = new insertion();

        list.insertAtPos(10, 1);
        list.insertAtPos(20, 2);
        list.insertAtPos(30, 3);
        list.insertAtPos(40, 4);

        System.out.println("Original list:");
        list.display();

        System.out.print("Enter value: ");
        int data = sc.nextInt();

        System.out.print("Enter position: ");
        int position = sc.nextInt();

        list.insertAtPos(data, position);

        System.out.println("After insertion:");
        list.display();

        sc.close();
    }
}
 
