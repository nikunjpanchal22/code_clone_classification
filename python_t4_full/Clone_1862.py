def increasing(fn, left, right) :
	left_items = [next(left)]
	right_items = [next(right)]
	heap = []


		pass
	return output

 
def increasing(fn, left, right) :
	heap = []
	while left or right :
		if left and right :
			if fn(right, left) > 0 :
				heap.append(left)
				left = next(left)
			else :
				heap.append(right)
				right = next(right)
		elif left :
			heap.append(left)
			left = next(left)


