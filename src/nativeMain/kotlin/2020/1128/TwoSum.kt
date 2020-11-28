fun twoSum(nums: IntArray, target: Int): IntArray {
    val size : Int = nums.size

    for (i in 0 until size) {
        for (j in size - 1 downTo i + 1) {
            if (nums[i] + nums[j] == target) {
                return intArrayOf(i, j)
            }
        }
    }

    return intArrayOf()
}