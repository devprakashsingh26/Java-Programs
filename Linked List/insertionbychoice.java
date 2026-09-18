import java.util.Scanner;

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class insertionbychoice {

    Node head;

    // Insert at start
    void insertAtStart(int data) {

        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    
}
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

    // Insert at specific position
    void insertAtPosition(int data, int pos) {

        if (pos == 1) {
            insertAtStart(data);
            return;
        }

        Node newNode = new Node(data);
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

    // Display
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

        // Create initial linked list
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " values:");

        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            list.insertAtEnd(data);
        }

        System.out.println("Original Linked List:");
        list.display();

        System.out.println("\nWhere do you want to insert?");
        System.out.println("1. At Start");
        System.out.println("2. At End");
        System.out.println("3. At Specific Position");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {

            System.out.print("Enter value: ");
            int data = sc.nextInt();

            list.insertAtStart(data);

        } else if (choice == 2) {

            System.out.print("Enter value: ");
            int data = sc.nextInt();

            list.insertAtEnd(data);

        } else if (choice == 3) {

            System.out.print("Enter value: ");
            int data = sc.nextInt();

            System.out.print("Enter position: ");
            int pos = sc.nextInt();

             list.insertAtPosition(data, pos);

        } else {

            System.out.println("Invalid choice");
        }

        System.out.println("\nLinked List after insertion:");
        list.display();

        sc.close();
    }
}
