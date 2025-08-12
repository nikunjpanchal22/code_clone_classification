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


def binary_search_function(my_list, target_value, starting_index=0, ending_index=None): 
	ending_index = len(my_list) - 1 if ending_index is None else ending_index 
	if starting_index > ending_index:
		return False
	middle_index = starting_index + (ending_index - starting_index)//2
	if my_list[middle_index] == target_value: 
		return middle_index
	elif my_list[middle_index] < target_value:
		return binary_search_function(my_list, target_value, middle_index + 1, ending_index) 
	else: 
		return binary_search_function(my_list, target_value, starting_index, middle_index - 1)


