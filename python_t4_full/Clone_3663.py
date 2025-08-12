def binary_search(a, x, lo = 0, hi = - 1) :
	i = bisect(a, x, lo, hi)
	if i == 0 :
		return - 1
	elif a [i - 1] == x :
		return i - 1
	else :
		return - 1


def binary_search(a, x, lo=0, hi=-1):
    hi = hi if hi!=-1 else len(a)-1
    i = bisect_right(a, x, lo, hi)
    return i-1 if i<=len(a) and a[i-1]==x else -1

 


