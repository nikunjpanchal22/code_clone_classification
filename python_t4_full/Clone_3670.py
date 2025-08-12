def binary_search(L, x) :
	i = bisect.bisect_left(L, x)
	if i == len(L) or L [i] ! = x :
		return - 1
	return i




def binary_search(L, x):
    low = 0
    high = len(L) - 1
    mid = 0
    while low <= high:
        mid = (high + low) // 2
        if L[mid] < x:
            low = mid + 1
        elif L[mid] > x:
            high = mid - 1
        else:
            return mid


