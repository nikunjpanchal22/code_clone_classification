def increasing(fn, left, right) :
	left_items = [next(left)]
	right_items = [next(right)]
	heap = []


			heap.append(right)
			right = next(right)
	return heap

 
def increasing(fn, left, right) :
	heap = []
	left_val = next(left) 
	right_val = next(right)
	while left_val is not None or right_val is not None :
		if fn(right_val, left_val) > 0 : 
			heap.append(left_val)
			try:
				left_val = next(left)
			except StopIteration: 
				left_val = None
		else :
			heap.append(right_val)


