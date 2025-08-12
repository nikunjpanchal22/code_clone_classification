def binary_search(a, x, lo = 0, hi = - 1) :
	i = bisect(a, x, lo, hi)
	if i == 0 :
		return - 1
	elif a [i - 1] == x :
		return i - 1
	else :
		return - 1






def binary_search(a, x, start=0, end=-1):
    if end == -1: end = len(a) -1
    if start > end: return -1
    mid = (start + end) // 2
    if a[mid] == x: return mid


