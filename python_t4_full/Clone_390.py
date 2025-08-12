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


  def binary_search(a_list, item, start = 0, end = None):
		end = end or len(a_list)
		mid = int((start + end) / 2)
		if start <= end:
			if a_list[mid] == item:
				return mid
			elif a_list[mid] > item:
				return binary_search(a_list, item, start, mid - 1)
			else:
				return binary_search(a_list, item, mid + 1, end)
		return False


