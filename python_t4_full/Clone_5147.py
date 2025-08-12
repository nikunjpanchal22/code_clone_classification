def sublist(a, b) :
	if not a :
		return True
	for k in range(len(b)) :
		if a [0] == b [k] :
			return sublist(a [1 :], b [k + 1 :])
	return False



def sublist(a, b):
    if a == []: return True
    if a[0] in b: return sublist(a[1:], b[b.index(a[0])+1:])
    return False





