package javacode;

class Linkedlist {

	private static final String EMPTY_LIST = "List is already empty";
	private static final String GREATER_INDEX_THAN_LIST_SIZE = "Index is greater than list size";
	private static final String VALID_INDEX = "Please enter a valid index";

	Node head;

	class Node {
		int val;
		Node next;

		Node(int val) {
			this.val = val;
		}
	}

	// Insertion Methods
	public void insertFirst(int val) {
		Node newNode = new Node(val);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void insertLast(int val) {
		Node newNode = new Node(val);
		if (head == null) {
			head = newNode;
		}
		for (Node temp = head; temp != null; temp = temp.next) {
			if (temp.next == null) {
				temp.next = newNode;
				break;
			}
		}
	}

	public void insertAt(int val, int index) {
		Node newNode = new Node(val);
		if (head == null) {
			if (index > 0 || index < 0) {
				System.out.println(VALID_INDEX);
			} else {
				head = newNode;
			}
		} else if (index == 0) {
			newNode.next = head;
			head = newNode;
		} else {
			Node temp = head;
			for (int i = 0; i < index; i++) {
				if (i == index - 1) {
					newNode.next = temp.next;
					temp.next = newNode;
					break;
				} else if (temp == null) {
					System.out.println(GREATER_INDEX_THAN_LIST_SIZE);
					break;
				}
				temp = temp.next;
			}
		}
	}

	// Delete Methods
	public void deleteFirst() {
		if (head == null) {
			System.out.println(EMPTY_LIST);
			return;
		}
		head = head.next;
	}

	public void deleteLast() {
		if (head == null) {
			System.out.println(EMPTY_LIST);
			return;
		} else if (head.next == null) {
			head = null;
			return;
		}
		for (Node temp = head; temp != null; temp = temp.next) {
			if (temp.next.next == null) {
				temp.next = null;
				break;
			}
		}
	}

	public void deleteAt(int index) {
		if (head == null) {
			System.out.println(EMPTY_LIST);
		} else if (head.next == null) {
			if (index > 0 || index < 0) {
				System.out.println(VALID_INDEX);
			} else {
				head = null;
			}
		} else {
			Node temp = head;
			for (int i = 0; i < index; i++) {
				if (i == index - 1) {
					if (temp.next == null) {
						System.out.println(GREATER_INDEX_THAN_LIST_SIZE);
						break;
					}
					temp.next = temp.next.next;
					break;
				} else if (temp == null) {
					System.out.println(GREATER_INDEX_THAN_LIST_SIZE);
					break;
				}
				temp = temp.next;
			}
		}
	}

	// Print Method
	public void printlist() {
		Node temp = head;
		System.out.println("List Elements are:");
		for (; temp != null; temp = temp.next) {
			System.out.printf("%d -> ", temp.val);
		}
		System.out.println();
	}

	// Size Method
	public void size() {
		int size = 0;
		for (Node temp = head; temp != null; temp = temp.next) {
			size++;
		}
		System.out.println("Size of linkedlist is: " + size);
	}

	// Search Method
	public void search(int val) {
		for (Node temp = head; temp != null; temp = temp.next) {
			if (temp.val == val) {
				System.out.println("Value found");
				return;
			}
		}
		System.out.printf("\nValue %d cannot be found in the list\n", val);
	}
}
