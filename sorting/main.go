package main

import "fmt"

func main() {
	input := []int{13, 46, 24, 52, 20, 9}
	//SelectionSort(input)
	BubbleSort(input)
	for _, val := range input {
		fmt.Printf("%d ", val)
	}
}
