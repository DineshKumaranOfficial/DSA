package main

/* In Bubble sort we iterate i from n - 1 to 0 and j from 0 to i
 */
func BubbleSort(input []int) {
	for i := len(input) - 1; i >= 0; i-- {
		for j := 0; j < i; j++ {
			if input[j] > input[j+1] {
				input[j], input[j+1] = input[j+1], input[j]
			}
		}
	}
}
