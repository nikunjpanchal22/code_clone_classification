def binary_search(L, x) :
	i = bisect.bisect_left(L, x)
	if i == len(L) or L [i] != x :
		return - 1
	return i


 def binary_search(L, x):
    start = 0
    end = len(L) - 1
    while start <= end:
        middle = int(start + (end - start) / 2)
        if L[middle] == x: 
            return middle
        elif L[middle] < x:
            start = middle + 1
        else:
            end = middle - 1
    return -1


