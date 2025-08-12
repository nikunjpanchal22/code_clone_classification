def binary_search(a_list, item, start = 0, end = None) :
	end = end or len(a_list)
	if start == end :
		if a_list [start] == item :
			return start
		return False
	mid = start + ((end - start) // 2)
	if a_list [mid] == item :
		return mid
	elif a_list [mid] > item :
		return binary_search(a_list, item, start = start, end = mid)
	elif a_list [mid] < item :
		return binary_search(a_list, item, start = mid + 1, end = end)
	else :
		return False


 def binary_searching(ar, target, low=0, high=None):
    high = len(ar) - 1 if not high else high
    mid = (high + low) // 2
    if ar[mid] == target:
        return mid
    elif low > high:
        return -1
    elif ar[mid] > target:
        return binary_searching(ar, target, low, mid - 1)
    else:
        return binary_searching(ar, target, mid + 1, high)


