def binary_search(a, x, lo = 0, hi = - 1) :
	i = bisect(a, x, lo, hi)
	if i == 0 :
		return - 1
	elif a [i - 1] == x :
		return i - 1
	else :
		return - 1


from bisect import bisect
def binary_search(a, x, lo=0, hi=-1):
    hi = hi if hi != -1 else len(a)
    i = bisect(a, x, lo, hi) - 1
    return i if i > -1 and a[i] == x else -1


