def binary_search(L, x) :
	i = bisect.bisect_left(L, x)
	if i == len(L) or L [i] != x :
		return - 1
	return i


 def binary_search(L, x):
    first = 0
    last = len(L) - 1
    while first < last:
        mid = (first + last) // 2
 
        if L[mid] == x:
            return mid
        elif L[mid] > x :
            last = mid
        elif L[mid] < x:
            first = mid + 1
 
    if L[last] == x:
        return last
 
    return -1


