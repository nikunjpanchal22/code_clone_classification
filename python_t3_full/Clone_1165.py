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
    lst = []
    left_idx = 0
    right_idx = 0
    while left_idx < len(left) and right_idx < len(right):   
        if left[left_idx] <= right[right_idx]:
            lst.append(left[left_idx])
            left_idx += 1
        else:
            lst.append(right[right_idx])
            right_idx += 1
    lst += left[left_idx:] + right[right_idx: ]
    return lst


