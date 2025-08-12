def is_sequence_same(list_a, list_b) :
	if list_a and list_a [0] in list_b :
		first = list_b.index(list_a [0])
	else :
		return False
	return list_a == (list_b [first :] + list_b [: first])


from itertools import cycle, islice
def is_sequence_same(list_a, list_b):
	if list_a and list_a [0] in list_b :
		first = list_b.index(list_a [0])
	else :
		return False
	cycled = cycle(list_b)
	shifted = islice(cycled, first, first+len(list_a))


