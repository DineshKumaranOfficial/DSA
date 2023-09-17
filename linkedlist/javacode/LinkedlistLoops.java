package javacode;

class LinkedlistLoops extends Linkedlist {
  // Loop Distance Using Floyd's Algorithm and Additional Pointer
  public void loopLength() {
    Node slow = head;
    Node fast = head;
    Node startPtr = head;
    int loopSize = 1;
    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        break;
      }
    }
    while (true) {
      if (slow != startPtr) {
        slow = slow.next;
        startPtr = startPtr.next;
      } else if (slow == startPtr) {
        slow = slow.next;
        while (startPtr != slow) {
          loopSize++;
          slow = slow.next;
        }
        break;
      }
    }
    System.out.println("Length of the loop is: " + loopSize);
  }

  // Starting point of loop using Floyd's Algorithm
  public void loopStart() {
    Node slow = head;
    Node fast = head;
    Node startPtr = head;

    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        while (slow != startPtr) {
          slow = slow.next;
          startPtr = startPtr.next;
        }
        break;
      }
    }
    System.out.println("Starting point of loop is: " + startPtr.val);
  }

  // Detect Loop Using Slow and Fast Pointer or Floyd's algorithm
  public void detectLoop() {
    Node slow = head;
    Node fast = head;

    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        System.out.println("Loop Exist");
        return;
      }
    }
    System.out.println("Loop doesn't exist");
  }

  // Middle ElementS using slow and fast pointer
  public void middleElem() {
    Node slow = head;
    Node fast = head;

    for (;;) {
      if (fast.next != null && fast.next.next != null) {
        slow = slow.next;
        fast = fast.next.next;
      } else {
        break;
      }
    }
    if (fast.next != null) {
      slow = slow.next;
    }
    System.out.println("Middle element of list is: " + slow.val);
  }

  // Create loop in LinkedlistS
  public void createCycle(int index) {
    Node temp = head;
    Node indexNode = head;
    int i = 0;
    while (temp != null) {
      if (i != index) {
        i++;
        indexNode = indexNode.next;
      }
      if (temp.next == null) {
        temp.next = indexNode;
        break;
      }
      temp = temp.next;
    }
  }
}
