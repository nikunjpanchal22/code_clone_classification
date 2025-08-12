def binary_search(L, x) :
	i = bisect.bisect_left(L, x)
	if i == len(L) or L [i] ! = x :
		return - 1
	return i


        if L[mid] == x:
            return mid
        elif L[mid] < x:
            start = mid + 1
        else:
            end = mid - 1
    return -1



def binary_search(L, x):
    low = 0
    high = len(L) - 1


