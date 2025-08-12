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
    dummy = Node(0)
    current = dummy

    while h1 != None and h2 != None:
        if h1.value < h2.value:
            current.next = h1
            h1 = h1.next
        else:
            current.next = h2
            h2 = h2.next
        current = current.next
    if h1 != None:
        current.next = h1
    if h2 != None:
        current.next = h2
    return dummy.next



