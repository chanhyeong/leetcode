fun removeDuplicates(nums: IntArray): Int {
	if (nums.isEmpty()) return 0

	var count = 0

	for (index in 1 until nums.size) {
		if (nums[count] == nums[index]) continue // skip when value is same
		else {
			nums[++count] = nums[index] // add 1 count and replace value of former index to current value
		}
	}

	return count + 1
}