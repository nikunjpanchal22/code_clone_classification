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


 def binary_search_recurse(array, target, start, end):
    if start > end:
        return False

    mid = (start + end)//2

    if array[mid] == target:
        return mid

    # target is smaller than mid-value
    elif array[mid] > target:
        return binary_search_recurse(array, target, start, mid-1)

    # target is greater than mid-value
    else:
        return binary_search_recurse(array, target, mid+1, end)


