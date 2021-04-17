fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
	val merged = nums1 + nums2
	merged.sort()

	val size = merged.size
	val middle = size / 2

	return when {
		size == 0 -> 0.0
		size % 2 == 1 -> merged[middle].toDouble()
		else -> (merged[middle - 1].toDouble() + merged[middle]) / 2
	}
}