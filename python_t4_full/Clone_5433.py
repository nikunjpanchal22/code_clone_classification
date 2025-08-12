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
    merged = []
    while h1:
        merged.append(h1)
        h1 = h1.next
    while h2:
        merged.append(h2)
        h2 = h2.next
    merged = sorted(merged, key = lambda x:x.value)
    for i in range(1, len(merged), 1):
        merged[i-1].next = merged[i]
    merged[-1].next = None
    return merged[0]



