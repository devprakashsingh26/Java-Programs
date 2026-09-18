class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
} 

public class insertionatstart{

    Node head;
     void insertAtStart(int data) {

        Node newNode = new Node(data);

        newNode.next = head;

        head = newNode;
    }

    void display(){
        Node temp = head;

        while(temp!=null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }

        System.out.println("null");

    }

    public static void main(String[] args) {
         
        insertionatstart obj = new insertionatstart();
        
        obj.insertAtStart(10);
        obj.insertAtStart(20);
        obj.insertAtStart(30);
        obj.insertAtStart(50);

        obj.display();



    }
}
