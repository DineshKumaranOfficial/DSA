package main

import "fmt"

func main() {
	//oneToN(1, 8)
	nToOne(8)
}

func nToOne(limit int) {
	if limit == 0 {
		return
	} else {
		fmt.Println(limit)
		nToOne(limit - 1)
	}
}

func oneToN(val, limit int) {
	if val > limit {
		return
	} else {
		fmt.Println(val)
		oneToN(val+1, limit)
	}
}
