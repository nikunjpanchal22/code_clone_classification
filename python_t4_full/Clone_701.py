def binary_search(L, x) :
	i = bisect.bisect_left(L, x)
	if i == len(L) or L [i] != x :
		return - 1
	return i


 def binary_search(L, x):
    left, right = 0, len(L)
    while left < right:
        mid = (left + right) // 2
        if L[mid] == x:
            return mid 
        if x < L[mid]:
            right = mid
        else:
            left = mid + 1
    return -1


