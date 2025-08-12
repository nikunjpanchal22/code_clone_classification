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


    while left_list and right_list:
        merge_list.append((left_list if left_list[0] <= right_list[0] else right_list).pop(0))
    return merge_list+left_list+right_list




def merge_parts(left_part, right_part):
    merged_parts = [None]*(len(left_part) + len(right_part))
    i = j = k = 0
    while i < len(left_part) and j < len(right_part):
        if left_part[i] <= right_part[j]:
            merged_parts[k] = left_part[i]
            i += 1
        else:
            merged_parts[k] = right_part[j]
            j += 1
        k += 1
    while i < len(left_part):
        merged_parts[k] = left_part[i]
        i += 1
        k += 1


