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




def removeRec4(node, value) :
	if node.value == value :
		node.value = node.next.value
		node.next = node.next.next
		return True
	if node.next == None :
		return False
	if node.next.value == value :
		temp = node.next
		node.next = temp.next
		return True
	return removeRec4(node.next, value)
