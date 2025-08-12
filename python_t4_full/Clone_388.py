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


def search(list_of_elements, key, start=0, end=None):
    if end  is  None:
        end = len(list_of_elements) - 1

    if start > end :
        return -1

    mid = start + (end - start)//2

    if list_of_elements[mid] is key:
        return mid
    elif list_of_elements[mid] > key:
        return search(list_of_elements, key, start, mid-1)
    else:
        return search(list_of_elements, key, mid+1, end)



