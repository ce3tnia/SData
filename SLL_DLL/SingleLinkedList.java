public class SingleLinkedList {
  Node head;

  public void insertHead(int v) {
    if (head == null) {
      head = new Node(v);
    } else {
      Node newNode = new Node(v);
      newNode.next = head;
      head = newNode;
    }
  }

  public void insertTail(int v) {
    if (head != null) {
      Node temp = head;
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = new Node(v);
    } else {
      insertHead(v);
    }
  }

  public void inserMid(int pos, int v) {
    if (head != null) {
      Node temp = head;
      int i = 0;
      while (temp.next != null && i < pos - 1) {
        temp = temp.next;
        i++;
      }
      final Node newNode = new Node(v);
      newNode.next = temp.next;
      temp.next = newNode;
    }
  }

  public void deleteHead() {
    if (head != null) {
      head = head.next;
    }
  }

  public void deleteTail() {
    if (head != null) {
      if (head.next != null) {
        Node temp = head;
        while (temp.next.next != null) {
          temp = temp.next;
        }
        temp.next = null;
      }
    }
  }

  public void deleteMid(int pos) {
    if (head != null) {
      if (pos > 0) {
        Node temp = head;
        int i = 0;
        while (temp.next != null && i < pos - 1) {
          temp = temp.next;
          i++;
        }
        temp.next = temp.next.next;
      } else {
        deleteHead();
      }
    }
  }

  public void search(int v) {
    if (head != null) {
      Node temp = head;
      int i = 0;
      while (temp != null) {
        if (temp.value == v) {
          System.out.println(v + " berada pada indeks ke " + i);
        }
        temp = temp.next;
        i++;
      }
    } else {
      System.out.println("Tidak ada");
    }
  }

  public void sumNode() {
    Node temp = head;
    int sum = 0;

    while (temp != null) {
      sum += temp.value;
      temp = temp.next;
    }
    System.out.print("Total nilai Node = " + sum);
  }

  public int length() {
    if (head != null) {
      Node temp = head;
      int n = 0;
      while (temp.next != null) {
        n++;
        temp = temp.next;
      }
      return n;
    } else
      return 0;
  }

  public void replace(int pos, int newValue) {
    if (head != null) {
      Node newNode = new Node(newValue);
      Node temp = head;
      int i = 0;
      if (pos > 0) {
        while (temp != null && i < pos - 1) {
          temp = temp.next;
          i++;
        }
        newNode.next = temp.next.next;
        temp.next = newNode;
      } else if (pos == 0) {
        newNode.next = head.next;
        head = newNode;
      }
    }
  }

  public void insertAfter(int v1, int v2) {
    if (head != null) {
      Node temp = head;
      int i = 0;
      while (temp != null) {
        if (temp.value == v1) {
          final Node newNode = new Node(v2);
          newNode.next = temp.next;
          temp.next = newNode;
        }
        temp = temp.next;
        i++;
      }
    }
  }

  public void deleteAfter(int v) {
    if (head != null) {
      Node temp = head;
      int i = 0;
      while (temp != null) {
        if (temp.value == v) {
          temp.next = temp.next.next;
        }
        temp = temp.next;
        i++;
      }
    }
  }

  public void printHead() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.value + " -> ");
      temp = temp.next;
    }
    System.out.print("null");
  }

}