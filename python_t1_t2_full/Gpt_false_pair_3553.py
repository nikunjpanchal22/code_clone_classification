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




def merge_lists(h1, h2) :
	if h2 is None :
		return h1 
	elif h1 is None :
		return h2 
	else: 
		if (h1.value < h2.value) :
			h1.next = merge_lists(h1.next, h2)
			return h1
		else: 
			h2.next = merge_lists(h2.next, h1)
			return h2
