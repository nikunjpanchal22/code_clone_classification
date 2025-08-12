def is_member(x) :
	a = [1, 5, 3, 9, 4, 100]
	for i in range(len(a)) :
		if x == a [i] :
			return True
	return False


def is_member(x):
    a = [1, 5, 3, 9, 4, 100]
    c = a.count(x)
    if c == 0:
        return False
    else:
        return True


