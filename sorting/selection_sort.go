package main

/* In Selection sort in each iteration we take the smallest element in the list and swap it with the first index
On each iteration the first index gets incremented to avoid infinite loop */
func SelectionSort(input []int) {
	for i := 0; i < len(input)-1; i++ {
		temp := i
		for j := i + 1; j < len(input); j++ {
			if input[j] < input[temp] {
				temp = j
			}
		}
		input[i], input[temp] = input[temp], input[i]
	}
}
