def increasing(fn, left, right) :
	left_items = [next(left)]
	right_items = [next(right)]
	heap = []



 
def increasing(fn, left, right) :
	output = []
	while left is not None and right is not None:
		if fn(right, left) > 0:
			output.append(left)
			left = next(left)
		else:
			output.append(right)
			right = next(right)
	if left is None:
		while right is not None:
			output.append(right)
			right = next(right)
	if right is None:
		while left is not None:
			output.append(left)


