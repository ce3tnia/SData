public class Queue { // First In First Out dengan menggunakan Linked List
  public static void main(String[] args) {
    Queue q = new Queue();
    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);
    q.enqueue(40);
    q.printQueue();
    System.out.println();
    q.dequeue();
    q.printQueue();
    q.println();
    System.out.println("\nFront item : " + q.front());
    System.out.println("Rear item : " + q.rear());
  }

  public class Node {
    int value;
    Node next;

    public Node(int v) {
      value = v;
    }
  }

  Node top;

  public void enqueue(int v) { // Menambahkan data ke queue
    Node newNode = new Node(v);
    if (top != null) {
      Node temp = top;
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = new Node(v);
    } else {
      top = newNode;
    }
    System.out.println(v + " enqueue to queue");
  }

  public void dequeue() { // Menghapus data teratas pada queue
    if (top == null) {
      System.out.println("Queue is empty");
    } else {
      System.out.println(top.value + " dequeue from queue");
      top = top.next;
    }
  }

  public int front() { // Mengambil data paling depan pada queue
    if (top == null) {
      System.out.println("Queue is empty");
      return 0;
    } else {
      return top.value;
    }
  }

  public int rear() {// Mengambil data paling belakang pada queue
    Node temp = top;
    int rear = 0;
    if (temp != null) {
      while (temp != null) {
        rear = temp.value;
        temp = temp.next;
      }
      return rear;
    } else {
      System.out.println("Queue is empty");
      return 0;
    }
  }

  public void printQueue() {// Mencetak semua isi queue
    Node temp = top;
    while (temp != null) {
      System.out.print(temp.value + " -> ");
      temp = temp.next;
    }
    System.out.print("null");
  }

  public void println() {
    System.out.println();
  }
}