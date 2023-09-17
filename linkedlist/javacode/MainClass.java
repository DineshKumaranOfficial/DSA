package javacode;

class MainClass {
	public static void main(String args[]) {
		MainClass mainClass = new MainClass();
		mainClass.basicOpsTest();
	}

	public void basicOpsTest() {
		Linkedlist ll = new Linkedlist();
		// Size and Print before insertion
		ll.printlist();
		ll.size();
		// Insert First
		for (int i = 5; i >= 1; i--) {
			ll.insertFirst(i);
		}
		ll.printlist();
		ll.size();
		// Insert Last
		for (int i = 7; i <= 10; i++) {
			ll.insertLast(i);
		}
		ll.printlist();
		ll.size();
		// Index at Index
		ll.insertAt(6, 5);
		ll.printlist();
		ll.size();

		// Search
		ll.search(6);

		// Delete First
		ll.deleteFirst();
		ll.printlist();
		ll.size();
		// Delete Last
		ll.deleteLast();
		ll.printlist();
		ll.size();
		// Delete At Index
		ll.deleteAt(7);
		ll.printlist();
		ll.size();
	}
}
