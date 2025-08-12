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


def binarySearch(arr, item, l, r):
    if (r < l):
        return -1
 
    mid = int(l + (r - l)/2)
 
    if (arr[mid] == item):
        return mid
 
    if (arr[mid] > item):
        return binarySearch(arr, item, l, mid-1)
 
    return binarySearch(arr, item, mid+1, r)


