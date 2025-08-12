def binary_search(a_list, item, start = 0, end = None) :
	end = end or len(a_list)
	if start == end :
		if a_list [start] == item :
			return start
		return False
	mid = start + ((end - start) / / 2)
	if a_list [mid] == item :
		return mid
	elif a_list [mid] > item :
		return binary_search(a_list, item, start = start, end = mid)
	elif a_list [mid] < item :
		return binary_search(a_list, item, start = mid + 1, end = end)
	else :
		return False




def binary_search(aList, item, start=0, end=None): 
		end = end or len(aList) 
		if start == end: 
				if aList[start] == item: 
						return start 
				return False 
		mid = start + (end - start) // 2 
		if aList[mid] == item: 
				return mid 
		elif aList[mid] > item: 
				return binary_search(aList, item, start=start, end=mid) 
		elif aList[mid] < item: 
				return binary_search(aList, item, start=mid+1, end=end) 
		else: 
				return False
