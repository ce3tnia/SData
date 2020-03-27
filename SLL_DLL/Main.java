public class Main {
  public static void main(String[] args) {
    SingleLinkedList sll = new SingleLinkedList();
    sll.insertHead(5);
    sll.insertHead(4);
    sll.insertTail(6);
    sll.insertTail(7);
    sll.insertTail(8);
    sll.inserMid(5, 11);
    sll.printHead();
    System.out.println();
    sll.sumNode();
    // sll.search(6);
    // sll.printHead();
    // System.out.println("\nSESUDAH INSERT AFTER");
    // sll.insertAfter(4, 15);
    // sll.printHead();
    // sll.deleteAfter(6);
    // System.out.println("\nSESUDAH DELETE AFTER");
    // sll.printHead();
    // sll.deleteMid(2);
    // System.out.println("\nSESUDAH DELETE MID");
    // sll.printHead();
    // sll.replace(4, 9);
    // System.out.println("\nSESUDAH REPLACE");
    // sll.printHead();

    // DoubleLinkedList dll = new DoubleLinkedList();
    // dll.insertHead(99);
    // dll.insertHead(944);
    // dll.insertHead(34);
    // dll.insertTail(27);
    // dll.inserMid(3, 3);
    // dll.inserAfter(27, 333);
    // System.out.print("Sebelum\n");
    // dll.printHead();
    // System.out.print("\nSesudah");
    // System.out.print("\nPrint Head : \n");
    // dll.deleteAfter(3);
    // dll.replace(3, 273);
    // dll.printHead();
    // System.out.println("\nPrint Tail : ");
    // dll.printTail();

    // CircularLinkedList cll = new CircularLinkedList();
    // cll.insertTail(4);
    // cll.insertTail(5);
    // cll.insertTail(6);
    // cll.printHead();
    // cll.insertHead(27);
    // cll.printHead();
    // cll.insertTail(2000);
    // cll.printHead();
  }
}