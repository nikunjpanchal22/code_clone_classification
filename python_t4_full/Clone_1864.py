def increasing(fn, left, right) :
	left_items = [next(left)]
	right_items = [next(right)]
	heap = []


	while left_val is not None or right_val is not None :
		if fn(right_val, left_val) > 0 :
			heap.append(left_val)
			left_val = next(left, None)
		else : 
			heap.append(right_val)
			right_val = next(right, None)
	return output

 
def increasing(fn, left, right) :
	output = [1]
	left_val = next(left)
	right_val = next(right)
	while left_val and right_val: 
		if fn(right, left) > 0: 
			output.append(left_val)
			left_val = next(left)
		else:
			output.append(right_val)


