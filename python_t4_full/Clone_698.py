def binary_search(L, x) :
	i = bisect.bisect_left(L, x)
	if i == len(L) or L [i] != x :
		return - 1
	return i


 def binary_search(L, x):
    low = 0
    high = len(L) - 1
    while low <= high:
        mid = (low + high) // 2
        if L[mid] == x:
            return mid 
        elif L[mid] < x:
            low = mid + 1
        else:
            high = mid - 1
    return -1


