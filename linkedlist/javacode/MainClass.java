package javacode;

class MainClass {
	public static void main(String args[]) {
		MainClass mainClass = new MainClass();
		// mainClass.basicOpsTest();
		// mainClass.loopTest();
		mainClass.interOpsTest();
	}

	public void interOpsTest() {
		LinkedlistInterOps ll = new LinkedlistInterOps();
		for (int i = 1; i < 6; i++) {
			ll.insertLast(i);
		}
		ll.printlist();
		ll.size();

		// Reverse list
		ll.reverse();
		ll.printlist();
		ll.size();

		// Palindrome
		for (int i = 2; i <= 5; i++) {
			ll.insertLast(i);
		}
		ll.printlist();
		ll.size();
		ll.isPalindrome();

		// Delete Nth Node from back of the list
		for (int i = 1; i <= 5; i++) {
			ll.insertLast(i);
		}
		System.out.println("before delete");
		ll.printlist();
		ll.removeNthNodeFromBack(5);
		System.out.println("after delete");
		ll.printlist();
		ll.size();
	}

	public void loopTest() {
		LinkedlistLoops ll = new LinkedlistLoops();
		for (int i = 1; i <= 6; i++) {
			ll.insertLast(i);
		}
		ll.printlist();
		ll.size();

		// Middle Element
		ll.middleElem();

		// Create Cycle
		ll.createCycle(2);

		// Loop Detection
		ll.detectLoop();
		// Loop Starting Point Detection
		ll.loopStart();
		// Loop length
		ll.loopLength();
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
