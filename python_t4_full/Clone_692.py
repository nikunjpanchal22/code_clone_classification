def binary_search(a, x, lo = 0, hi = - 1) :
	i = bisect(a, x, lo, hi)
	if i == 0 :
		return - 1
	elif a [i - 1] == x :
		return i - 1
	else :
		return - 1


 def binary_search(a, x, lo = 0, hi = len(a)) :
	pos = None
	while lo <= hi : 
		mid = (lo + hi) // 2
		if x == a[mid] : 
			pos = mid
			break
		elif x < a[mid] : 
			hi = mid - 1
		else : 
			lo = mid + 1
	if pos != None and a[pos] == x :
		return pos
	else :
		return -1


