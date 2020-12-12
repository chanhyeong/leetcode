fun lengthOfLongestSubstring(s: String): Int {
	var maxLength : Int = 0
	var currentMaxString : String = ""

	for (char in s.split("")) {
		if (currentMaxString.contains(char)) {
			maxLength = if (maxLength < currentMaxString.count()) currentMaxString.count() else maxLength
			currentMaxString = currentMaxString.split(char)[1]
		}

		currentMaxString += char
	}

	return maxLength
}