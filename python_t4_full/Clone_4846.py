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


    return node and ((node.value==value and node.next is node.next.next) or removeRec(node.next, value))


 

def removeRec(node, value) :
    if node is None : return False
    if node.value == value : 
        node.value = node.next.value


