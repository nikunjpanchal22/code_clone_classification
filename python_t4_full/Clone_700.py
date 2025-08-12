def binary_search(L, x) :
	i = bisect.bisect_left(L, x)
	if i == len(L) or L [i] != x :
		return - 1
	return i


 def binary_search(L, x):
    left = 0
    right = len(L) - 1
    while left <= right:
        midpoint = (left + right) // 2
        if L[midpoint] == x: 
            return midpoint
        elif L[midpoint] > x:
            right = midpoint - 1 
        else: 
            left = midpoint + 1 
    return -1 


