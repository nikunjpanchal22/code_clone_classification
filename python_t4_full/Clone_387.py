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


 def binary_search_with_recursion(list_of_elements, target_element, left=0, right=None):
    if right is None:
        right = len(list_of_elements)-1

    mid_index = left+int((right - left)/2)
    mid_element = list_of_elements[mid_index]

    if right>=left:
        if mid_element == target_element:
            print("Target found at index :", mid_index)
            return mid_index
        elif mid_element < target_element:
            return binary_search_with_recursion(list_of_elements, target_element, mid_index+1, right)

        else:
            return binary_search_with_recursion(list_of_elements, target_element, left, mid_index-1)
    else:
        return -1


