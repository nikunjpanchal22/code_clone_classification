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
    from bisect import bisect
    pos = bisect(a, x, lo, hi)
    return pos - 1 if pos > 0 and a[pos - 1] == x else -1




