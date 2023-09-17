package main

import "fmt"

type node struct {
	val  int
	next *node
}

// Delete Methods
func removeAt(head **node, index int) {
	if index <= 0 {
		fmt.Println("Please give index greater than 0")
		return
	}
	if *head == nil {
		fmt.Println("List is already empty")
		return
	}
	if index > 0 {
		var temp *node
		temp = *head
		for i := 1; i < index; i++ {
			if temp == nil {
				fmt.Println("Index is exceeding the List size")
				return
			}
			if i == index-1 {
				temp.next = temp.next.next
				return
			}
			temp = temp.next
		}
	}
}

func removeFirst(head **node) {
	if *head == nil {
		fmt.Println("List is already empty")
	}
	*head = (**head).next
}

func removeLast(head **node) {
	if *head == nil {
		fmt.Println("List is already empty")
	}
	for temp := *head; temp != nil; temp = temp.next {
		if temp.next.next == nil {
			temp.next = nil
			break
		}
	}
}

// Insert Methods
func insertAt(head **node, val, index int) {
	newNode := node{val, nil}

	if index <= 0 {
		fmt.Println("Please enter a index greater than zero")
		return
	}
	if *head == nil {
		if index == 1 {
			*head = &newNode
			return
		} else {
			fmt.Printf("Can't insert element at %d index in an empty list", index)
			fmt.Println()
			return
		}
	}
	if index > 0 {
		var temp *node
		temp = *head
		for i := 1; i < index; i++ {
			if temp == nil {
				fmt.Printf("Index %d is exceeding the list size", index)
				fmt.Println()
				return
			}
			if i == index-1 {
				newNode.next = temp.next
				temp.next = &newNode
				return
			}
			temp = temp.next
		}
	}
}

func insertFirst(head **node, val int) {
	newNode := node{val, nil}

	if *head == nil {
		*head = &newNode
	} else {
		newNode.next = *head
		*head = &newNode
	}
}

func insertLast(head **node, val int) {
	newNode := node{val, nil}

	if *head == nil {
		*head = &newNode
	} else {
		var temp *node
		temp = *head
		for ; temp != nil; temp = temp.next {
			if temp.next == nil {
				temp.next = &newNode
				break
			}
		}
	}
}

func search(head **node, val int) bool {
	var temp *node
	temp = *head
	for ; temp != nil; temp = temp.next {
		if val == temp.val {
			return true
		}
	}
	return false
}

func printList(head **node) {
	var temp *node
	temp = *head
	fmt.Println("Elements in list are: ")
	for ; temp != nil; temp = temp.next {
		fmt.Printf("%d -> ", temp.val)
	}
	fmt.Println()
}

func size(head **node) int {
	count := 0
	var temp *node
	for temp = *head; temp != nil; temp = temp.next {
		count++
	}
	return count
}
