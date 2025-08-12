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


 def binarySearch(a_list, item, low=0, high=None):
	high = len(a_list) - 1 if high is None else high

	while low <= high:
		mid = (low + high) // 2
		if a_list[mid] == item:
			return mid
		elif item > a_list[mid]:
			low = mid + 1
		else: 
			high = mid - 1
	return -1


