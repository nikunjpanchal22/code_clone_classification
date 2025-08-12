def is_sequence_same(list_a, list_b) :
	if list_a and list_a [0] in list_b :
		first = list_b.index(list_a [0])
	else :
		return False
	return list_a == (list_b [first :] + list_b [: first])



def is_sequence_same(list_a, list_b):
	if not list_a or list_a[0] not in list_b:
		return False
	first = list_b.index(list_a[0])
	list_c = list_b[first:] + list_b[:first]
	for i in range(len(list_a)):
		if list_a[i] != list_c[i]:
			return False
	return True




