package project2example;

public class LinkedList implements Sequence {
    private Node front;
    private int length = 0;

    private static class Node implements Position {
        Object data;
        Node next prev; 
        public Node(Object data, Node next, Node prev){
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    public void append(Object val) {
        if (front == null) { front = new Node(val, null, null); }
        else {
            Node current = front;
            while (current.next != null) {
                current = current.next;
            }
        }
        current.next = new Node (val, current, null);
    }
}
