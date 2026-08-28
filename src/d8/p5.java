package d8;

public class p5 {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static void main(String[] args) {

       
        Node first = new Node(10);
        Node second = new Node(20);

        first.next = second;

        
        Node third = new Node(30);
        Node fourth = new Node(40);

        third.next = fourth;

        
        second.next = third;

        
        Node current = first;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }
}

