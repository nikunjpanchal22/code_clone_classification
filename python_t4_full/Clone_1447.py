def is_member(x) :
	a = [1, 5, 3, 9, 4, 100]
	for i in range(len(a)) :
		if x == a [i] :
			return True
	return False


def is_member(x):
	a = [1, 5, 3, 9, 4, 100]
	is_member = x in a
	return is_member


