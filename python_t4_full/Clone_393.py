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


 def recursive_binary_search(arr, target, left=0, right=None):
    right = len(arr) - 1 if right is None else right
    mid = (right + left) // 2
    if right < left:
        return -1
    elif arr[mid] == target:
        return mid
    elif arr[mid] > target:
        return recursive_binary_search(arr, target, left, mid - 1)
    else:
        return recursive_binary_search(arr, target, mid + 1, right)


