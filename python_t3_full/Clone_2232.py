def increasing(fn, left, right) :
	left_items = [next(left)]
	right_items = [next(right)]
	heap = []



import heapq
def increasing(fn, left, right) :
	left_items = [next(left)]
	right_items = [next(right)]
	heap = [(left_items[0], 'left'), (right_items[0], 'right')]
	heapq.heapify(heap)


