public class DoubleLinkedList {
  Node head;
  Node tail;

  public void insertHead(int v) {
    if (head == null) {
      head = new Node(v);
      tail = head;
    } else {
      Node newNode = new Node(v);
      head.prev = newNode;
      newNode.next = head;
      head = newNode;
    }
  }

  public void insertTail(int v) {
    if (tail != null) {
      Node newNode = new Node(v);
      tail.next = newNode;
      newNode.prev = tail;
      tail = newNode;
    } else {
      tail = new Node(v);
      head = tail;
    }
  }

  public void inserMid(int pos, int v) {
    if (head != null) {
      Node temp = head;
      int i = 0;
      while (temp != null && i < pos - 1) {
        temp = temp.next;
        i++;
      }
      Node newNode = new Node(v);
      newNode.next = temp.next;
      temp.next.prev = newNode;
      temp.next = newNode;
      newNode.prev = temp;
    }
  }

  public void inserAfter(int v1, int v2) {
    if (head != null) {
      Node temp = head;
      int i = 0;
      while (temp != null) {
        if (temp.value == v1) {
          if (temp.next != null) {
            Node newNode = new Node(v2);
            newNode.next = temp.next;
            temp.next.prev = newNode;
            temp.next = newNode;
            newNode.prev = temp;
          } else {
            insertTail(v2);
          }
          break;
        }
        temp = temp.next;
        i++;
      }
    }
  }

  public void deleteHead() {
    if (head != null) {
      head = head.next;
      head.prev = null;
    }
  }

  public void deleteTail() {
    if (tail != null) {
      tail = tail.prev;
      tail.next = null;
    }
  }

  public void deleteMid(int pos) {
    if (head != null) {
      Node temp = head;
      int i = 0;
      while (temp != null && i < pos - 1) {
        temp = temp.next;
        i++;
      }
      temp.next = temp.next.next;
      temp.next.prev = temp;
    }
  }

  public void deleteAfter(int v) { // tugas
    if (head != null) {
      Node temp = head;
      int i = 0;
      while (temp != null) {
        if (temp.value == v) {
          if (temp.next.next == null) {
            temp.next = null;
            tail = temp;
            break;
          } else {
            temp.next = temp.next.next;
            temp.next.prev = temp;
          }
          break;
        }
        temp = temp.next;
        i++;
      }
    }
  }

  public void replace(int v1, int v2) { // tugas
    if (head != null) {
      Node temp = head;
      int i = 0;
      while (temp != null) {
        if (temp.value == v1) {
          temp.value = v2;
        }
        temp = temp.next;
        i++;
      }
    } else {
      System.out.println("Tidak ada");
    }
  }

  public void update(int pos, int v) { // tugas
    if (head != null) {
      Node newNode = new Node(v);
      Node temp = head;
      int i = 0;
      if (pos > 0) {
        while (temp != null && i < pos - 1) {
          temp = temp.next;
          i++;
        }
        if (temp.next.next == null) {
          newNode.next = null;
          newNode.prev = temp;
          temp.next = newNode;
          tail = newNode;
        } else {
          newNode.next = temp.next.next;
          newNode.prev = temp;
          temp.next = newNode;
          temp.next.next.prev = newNode;
        }
      } else if (pos == 0) {
        newNode.next = head.next;
        head.next.prev = newNode;
        head = newNode;
      }
    }
  }

  public void printHead() {
    Node temp = head;
    System.out.print("null <-> ");
    while (temp != null) {
      System.out.print(temp.value + " <-> ");
      temp = temp.next;
    }
    System.out.print("null");
  }

  public void printTail() {
    Node temp = tail;
    System.out.print("null <-> ");
    while (temp != null) {
      System.out.print(temp.value + " <-> ");
      temp = temp.prev;
    }
    System.out.print("null");
  }
}
// muflihunnaim275@gmail.com
// subject Tugas2_Struktur_Data_B_H07118310
// File DoubleLinkedList.java ji yang didownload