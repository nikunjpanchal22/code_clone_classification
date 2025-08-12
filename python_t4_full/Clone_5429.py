def merge_lists(h1, h2) :
	if h1 is None :
		return h2
	if h2 is None :
		return h1
	if (h1.value < h2.value) :
		h1.next = merge_lists(h1.next, h2)
		return h1
	else :
		h2.next = merge_lists(h2.next, h1)
		return h2



def merge_lists(h1, h2):
    dummyNode = Node(0)
    tail = dummyNode
    while True:
        if h1 is None:
            tail.next = h2
            break
        if h2 is None:
            tail.next = h1
            break

        if h1.value <= h2.value:
            tail.next = h1
            h1 = h1.next
        else:
            tail.next = h2
            h2 = h2.next
        
        tail = tail.next
    return dummyNode.next



