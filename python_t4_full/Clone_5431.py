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
    values = []
    while h1:
        values.append(h1.value)
        h1 = h1.next
    while h2:
        values.append(h2.value)
        h2 = h2.next
    values.sort()

    dummyHead = Node(0)
    cur = dummyHead
    for value in values:
        cur.next = Node(value)
        cur = cur.next
    return dummyHead.next




