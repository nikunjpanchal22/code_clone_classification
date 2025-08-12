def sublist(a, b) :
	if not a :
		return True
	for k in range(len(b)) :
		if a [0] == b [k] :
			return sublist(a [1 :], b [k + 1 :])
	return False



def sublist(a, b):
    try:
        first = b.index(a[0])
    except ValueError:
        return False


