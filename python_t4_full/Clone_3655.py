def binary_search(a, x, lo = 0, hi = - 1) :
	i = bisect(a, x, lo, hi)
	if i == 0 :
		return - 1
	elif a [i - 1] == x :
		return i - 1
	else :
		return - 1


from bisect import bisect_left
def binary_search(arr, x, start=0, end=None): 
    if end is None: end = len(arr) - 1
    pos = bisect_left(arr, x, start, end) 
    return pos if pos != end and arr[pos] == x else -1

 
Python
def binary_search(input_list, target, start=0, end=-1):
    if end == -1:
        end = len(input_list) - 1
    while start <= end:
        mid = (start + end) // 2
        if input_list[mid] == target:
            return mid


