def sublist(a, b) :
	if not a :
		return True
	for k in range(len(b)) :
		if a [0] == b [k] :
			return sublist(a [1 :], b [k + 1 :])
	return False





def sublist(a, b):
    if len(a) == 0:
        return True
    else:
        for i in range(len(b)):
            if a[0] == b[i]:
                return sublist(a[1:], b[i+1:])


