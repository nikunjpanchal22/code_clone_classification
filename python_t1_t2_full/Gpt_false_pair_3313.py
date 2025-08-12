def binary_search(a, x, lo = 0, hi = - 1) :
	i = bisect(a, x, lo, hi)
	if i == 0 :
		return - 1
	elif a [i - 1] == x :
		return i - 1
	else :
		return - 1




def binary_search(a, target, left = 0, right = - 1) :
	j = bisect(a, target, left, right)
	if j == 0 :
		return - 1
	elif a [j - 1] == target :
		return j - 1
	else :
		return - 1
