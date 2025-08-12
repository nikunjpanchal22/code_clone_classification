def is_sequence_same(list_a, list_b) :
	if list_a and list_a [0] in list_b :
		first = list_b.index(list_a [0])
	else :
		return False
	return list_a == (list_b [first :] + list_b [: first])



def is_sequence_same(list_a, list_b):
	if list_a and list_a [0] in list_b :
		first = list_b.index(list_a [0])
	else :
		return False
	iterator = iter(list_b[first:] + list_b[:first])
	return all(a==b for a,b in zip(list_a, iterator))




