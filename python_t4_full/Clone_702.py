def binary_search(L, x) :
	i = bisect.bisect_left(L, x)
	if i == len(L) or L [i] != x :
		return - 1
	return i


 def binary_search(L, x): 
   start, end = 0, len(L) - 1
   while start <= end:
        mid = (start + end) // 2
        if L[mid] == x:
            return mid 
        if x > L[mid]:
            start = mid + 1
        else:
            end = mid - 1
   return -1


