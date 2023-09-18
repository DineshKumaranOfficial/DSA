package javacode;

class LinkedlistInterOps extends Linkedlist {

	private final static String EMPTY_LIST = "List is already empty";
	private final static String INDEX_GREATER_THAN_SIZE = "Index size is greater than list size";

	// Delete Nth node from Back of the list
	public void removeNthNodeFromBack(int index) {
		System.out.println("Method Name: removeNthNodeFromBack");
		if (head == null) {
			System.out.println(EMPTY_LIST);
			return;
		}
		// Size of linkedlist
		Node slow = head;
		Node fast = head;
		int size = 1;
		int mid = 0;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			size++;
		}
		mid = size - 1;
		size *= 2;
		if (fast.next != null) {
			slow = slow.next;
			mid++;
		} else {
			size -= 1;
		}
		// Removing the nth node from back
		if (index > size) {
			System.out.println(INDEX_GREATER_THAN_SIZE);
			return;
		} else {
			index = size - index;
			if (index == 0) {
				head = head.next;
				return;
			} else if (index <= mid) {
				Node entry = head;
				for (int i = 0; i < index; i++) {
					if (i == index - 1) {
						entry.next = entry.next.next;
						break;
					}
					entry = entry.next;
				}
			} else {
				for (int i = mid; i < index; i++) {
					if (i == index - 1) {
						slow.next = slow.next.next;
						break;
					}
					slow = slow.next;
				}
			}
		}
	}

	// Palindrome Validation
	public void isPalindrome() {
		Node slow = head;
		Node fast = head;
		// Middle Element Identification
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		if (fast.next != null) {
			slow = slow.next;
		}
		// Reverse the middle to last elements
		Node midPtr = null;
		Node nextPtr = null;
		while (slow != null) {
			nextPtr = slow.next;
			slow.next = midPtr;
			midPtr = slow;
			slow = nextPtr;
		}
		// Palindrome Check
		Node entry = head;
		while (entry != null && midPtr != null) {
			if (entry.val != midPtr.val) {
				System.out.println("The linkedlist is not Palindrome");
				return;
			}
			entry = entry.next;
			midPtr = midPtr.next;
		}
		System.out.println("The linkedlist is Palindrome");
	}

	// Reverse using Multi Pointers with O(1) space
	public void reverse() {
		System.out.println("Linkedlist Reversal method called");
		Node result = null;
		Node nextNode = null;

		while (head != null) {
			nextNode = head.next;
			head.next = result;
			result = head;
			head = nextNode;
		}
		head = result;
	}
}
