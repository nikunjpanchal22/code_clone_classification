def removeRec(node, value) :
	if node.value == value :
		node.value = node.next.value
		node.next = node.next.next
		return True
	if node.next == None :
		return False
	if node.next.value == value :
		node.next = node.next.next
		return True
	return removeRec(node.next, value)




def removeRec(node, value) :
	if node.value == value :
		node.value = node.next.value
		node.next = node.next.next
		return True
	if node.next == None :
		return False
	if node.next.value != value :
		return removeRec(node.next, value)
	node.next = node.next.next
	return True

