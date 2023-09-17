package main

// Length of loop
func getLoopLength(head **node) int {
	slow := *head
	fast := *head
	// loop detection
	for fast.next != nil && fast.next.next != nil {
		slow = slow.next
		fast = fast.next.next
		if slow == fast {
			break
		}
	}
	// starting point of loop
	entry := *head
	for {
		if entry == slow {
			break
		} else {
			entry = entry.next
			slow = slow.next
		}
	}
	//length of the loop
	size := 0
	for {
		slow = slow.next
		size++
		if entry == slow {
			break
		}
	}
	return size
}

// Starting point of loop
// Also called as Floyd's Algorithm
func getloopstartnode(head **node) *node {
	slow := *head
	fast := *head
	// loop detection
	for fast.next != nil && fast.next.next != nil {
		slow = slow.next
		fast = fast.next.next
		if slow == fast {
			break
		}
	}
	// to find starting point of loop
	entry := *head
	for {
		if entry == slow {
			break
		} else {
			entry = entry.next
			slow = slow.next
		}
	}
	return entry
}

// Detect loop
func detectLoop(head **node) bool {
	slow := *head
	fast := *head

	for fast.next != nil && fast.next.next != nil {
		slow = slow.next
		fast = fast.next.next
		if slow == fast {
			return true
		}
	}

	return false
}

// Middle Element in Linkedlist
func getMiddleElem(head **node) int {
	if head == nil {
		return -1
	}
	if (*head).next == nil {
		return (*head).val
	}
	slow := *head
	fast := *head
	for fast.next != nil && fast.next.next != nil {
		slow = slow.next
		fast = fast.next.next
	}
	if fast.next != nil {
		slow = slow.next
	}
	return slow.val
}
