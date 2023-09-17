package main

import "fmt"

func main() {
	//testMethod1()
	loopTest1()
}

func testMethod1() {
	var ll *node
	ll = nil

	// Inserting
	for i := 5; i >= 1; i-- {
		insertFirst(&ll, i)
	}
	for i := 6; i <= 10; i++ {
		insertLast(&ll, i)
	}
	printList(&ll)
	fmt.Println("Size of linkedlist is: ", size(&ll))

	// Insert with Index
	insertAt(&ll, 12, 3)
	printList(&ll)
	fmt.Println("Size of linkedlist is: ", size(&ll))

	// Removing
	removeFirst(&ll)
	printList(&ll)
	fmt.Println("Size of linkedlist is: ", size(&ll))

	removeLast(&ll)
	printList(&ll)
	fmt.Println("Size of linkedlist is: ", size(&ll))

	removeAt(&ll, 2)
	printList(&ll)
	fmt.Println("Size of linkedlist is: ", size(&ll))

	// Searching
	fmt.Println("Does 11 exists in the linkedlist: ", search(&ll, 11))
	fmt.Println("Does 3 exisits in the linkedlist: ", search(&ll, 3))

	// Middle Element
	fmt.Println("Middle of linkedlist is:", getMiddleElem(&ll))
	removeLast(&ll)
	fmt.Println("Middle of linkedlist after deleting last elem is:", getMiddleElem(&ll))
}

func loopTest1() {
	node1 := &node{1, nil}
	node2 := node{2, nil}
	node3 := node{3, nil}
	node4 := node{4, nil}
	node5 := node{5, nil}
	node6 := node{6, nil}

	node1.next = &node2
	node2.next = &node3
	node3.next = &node4
	node4.next = &node5
	node5.next = &node6
	node6.next = &node3

	fmt.Println("Does loop Exist:", detectLoop(&node1))
	fmt.Println("Starting point of loop is:", getloopstartnode(&node1))
	fmt.Println("Length of the loop is:", getLoopLength(&node1))
	node6.next = nil
	fmt.Println("After setting nil for last node, does loop exist:", detectLoop(&node1))
}
