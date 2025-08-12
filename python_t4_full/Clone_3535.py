def is_sequence_same(list_a, list_b) :
	if list_a and list_a [0] in list_b :
		first = list_b.index(list_a [0])
	else :
		return False
	return list_a == (list_b [first :] + list_b [: first])


import numpy as np
def is_sequence_same(list_a, list_b):
	first = np.where(np.array(list_b)==list_a[0])[0]
	return False if first.size == 0 else np.array_equal(list_a, np.roll(list_b, -first[0]))




