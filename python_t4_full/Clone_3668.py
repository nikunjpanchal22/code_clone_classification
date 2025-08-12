def binary_search(a, key, imin = 0, imax = None) :
	if imax is None :
		imax = len(a) - 1
	while imin < = imax :
		mid = (imin + imax) / / 2
		midval = a [mid]
		if midval < key :
			imin = mid + 1
		elif midval > key :
			imax = mid - 1
		else :
			return mid
	raise ValueError





def binary_search(lst, target, start = 0, end = None):
    if end is None: end = len(lst)-1
    while start <= end:
        mid = (start + end)//2
        if target == lst[mid]: return mid
        elif target < lst[mid]: end = mid - 1


