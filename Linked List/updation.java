
import java.util.Scanner;

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class updation {

    Node head;

    void insertAtEnd(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    void update(int pos, int newValue) {

        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }

        Node temp = head;

        for (int i = 1; i < pos; i++) {

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

        temp.data = newValue;
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

        updation list = new updation();

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter values:");

        for (int i = 0; i < n; i++) {

            int data = sc.nextInt();

            list.insertAtEnd(data);
        }

        System.out.println("Original Linked List:");
        list.display();

        System.out.print("Enter position to update: ");
        int pos = sc.nextInt();

        System.out.print("Enter new value: ");
        int newValue = sc.nextInt();

        list.update(pos, newValue);

        System.out.println("After updation:");
        list.display();

        sc.close();
    }
}
