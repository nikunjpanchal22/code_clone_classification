def binary_search(L, x) :
	i = bisect.bisect_left(L, x)
	if i == len(L) or L [i] ! = x :
		return - 1
	return i




def binary_search(L, x):
    i = bisect.bisect_right(L, x)

    if i == len(L) or L[i] != x:
        return -1
    return i
