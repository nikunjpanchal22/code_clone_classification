def merge(left, right) :
	result = []
	i, j = 0, 0
	while i < len(left) and j < len(right) :
		if left [i] < right [j] :
			result.append(left [i])
			i += 1
		else :
			result.append(right [j])
			j += 1
	result.extend(left [i :])
	result.extend(right [j :])
	return result


 def merge(left, right): 
    merged_list = [] 
    left_idx, right_idx = 0, 0 
   
    # set "while" loop, as long as either list contains an element
    while left_idx < len(left) and right_idx < len(right):
        # if left element < right element, add left to merged list
        if left[left_idx] <= right[right_idx]:
            merged_list.append(left[left_idx])
            left_idx += 1
        # vice versa
        else:
            merged_list.append(right[right_idx])
            right_idx += 1
    # add any remaining items in the left list to merged list
    if left_idx < len(left):
        merged_list.extend(left[left_idx:])
    # add any remaining items in the right list to merged list
    if right_idx < len(right):
        merged_list.extend(right[right_idx:])
    # return merged list
    return merged_list
