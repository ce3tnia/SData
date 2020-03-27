public class CircularLinkedList {
  Node head;
  Node tail;
  boolean visited;

  public void insertTail(int v) {
    if (head == null) {
      head = new Node(v);
      return;
    }
    if (tail == null) {
      tail = new Node(v);
      head.next = tail;
      tail.next = head;
      return;
    }
    Node newNode = new Node(v);
    newNode.next = head;
    tail.next = newNode;
    tail = newNode;
  }

  public void insertHead(int v) {
    if (head == null) {
      head = new Node(v);
      return;
    } else {
      Node newNode = new Node(v);
      newNode.next = head;
      tail.next = newNode;
      head = newNode;
    }
  }

  public void printHead() {
    Node temp = head;
    do {
      System.out.print(temp.value + " -> ");
      temp = temp.next;
    } while (temp != head);
    System.out.println();
  }
}