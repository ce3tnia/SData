public class Stack { // Last In First Out or First In Last Out dengan menggunakan Linked List
  public class Node {
    int value;
    Node next;

    public Node(int v) {
      value = v;
    }
  }

  Node top;

  public void push(int v) { // Menambahkan data ke stack
    Node newNode = new Node(v);
    if (top == null) {
      top = newNode;
    } else {
      Node temp = top;
      top = newNode;
      newNode.next = temp;
    }
    System.out.println(v + " pushed to stack");
  }

  public void pop() { // Menghapus data teratas pada stack
    if (top == null) {
      System.out.println("Stack is Empty");
    } else {
      System.out.println(top.value + " popped from stack");
      top = top.next;
    }
  }

  public int peek() { // Mengembalikan data teratas pada stack
    if (top == null) {
      System.out.println("Stack is Empty");
      return 0;
    } else {
      return top.value;
    }
  }

  public void printStack() {// Mencetak semua isi stack
    Node temp = top;
    while (temp != null) {
      System.out.print(temp.value + " -> ");
      temp = temp.next;
    }
    System.out.println("null");
  }
  public static void main(String[] args) {
    Stack s = new Stack();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    s.printStack();   
    s.pop();
    System.out.println("\nafter pop");
    s.printStack();
    System.out.println("\nTop element is " + s.peek());
  }
}