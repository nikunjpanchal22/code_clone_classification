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


import heapq
def merge_lists(h1, h2):
    queue = []
    if h1 is not None:
        heapq.heappush(queue, (h1.value, h1))
    if h2 is not None:
        heapq.heappush(queue, (h2.value, h2))

    dummyHead = Node()
    tail = dummyHead
    while queue:
        _, smallestNode = heapq.heappop(queue)
        tail.next = smallestNode
        tail = tail.next
        if smallestNode.next is not None:
            heapq.heappush(queue, (smallestNode.next.value, smallestNode.next))
    return dummyHead.next




