fun maxProfit(prices: IntArray): Int {
	if (prices.isEmpty()) return 0

	var profit = 0

	var min = prices[0]
	var max = Int.MIN_VALUE

	for (index in 1 until prices.size) {
		if (min >= prices[index]) { // find min
			min = prices[index]
			continue // preventing max is same with min
		}

		if (prices[index] > max) { // find max
			max = prices[index]
		}

		if (min < max) {
			if (index == prices.lastIndex) { // prevent Array Outbound exception
				profit += (max - min)
			} else if (max > prices[index + 1]) { // when next value is lower than current max
				profit += (max - min) // caculate profit

				// re-initialize min/max value
				min = Int.MAX_VALUE
				max = Int.MIN_VALUE
			}
		}
	}

	return profit
}