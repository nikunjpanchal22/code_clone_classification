def binary_search(a, x, lo = 0, hi = - 1) :
	i = bisect(a, x, lo, hi)
	if i == 0 :
		return - 1
	elif a [i - 1] == x :
		return i - 1
	else :
		return - 1


def binary_search(arr, x, start=0, end=-1): 
    i = bisect.bisect_left(arr, x, start, end)
    return i if i != len(arr) and arr[i] == x else -1

 
Python
def binary_search(lst, num, lo=0, hi=-1):
    if hi == -1: hi = len(lst) - 1
    while lo <= hi:
        mid = (lo + hi) // 2


