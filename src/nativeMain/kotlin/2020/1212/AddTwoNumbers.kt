class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
	var returnListNode : ListNode? = null
	var currentLastNode : ListNode? = null

	var firstNode = l1
	var secondNode = l2

	var add = false

	while (firstNode != null || secondNode != null) {
		var sum = (firstNode?.`val` ?: 0) + (secondNode?.`val` ?: 0)
		if (add) {
			sum += 1
		}

		add = sum / 10 == 1

		val node = ListNode(sum % 10)

		if (returnListNode == null) {
			returnListNode = node
			currentLastNode = node
		} else {
			currentLastNode?.next = node
			currentLastNode = node
		}

		firstNode = firstNode?.next
		secondNode = secondNode?.next
	}

	if (add) {
		currentLastNode?.next = ListNode(1)
	}

	return returnListNode
}