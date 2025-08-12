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
    result = []
    left_len = len(left)
    right_len = len(right)
    left_c = 0
    right_c = 0
    while left_c < left_len and right_c < right_len:
        if left[left_c] < right[right_c]:
            result.append(left[left_c])
            left_c += 1  
        else:
            result.append(right[right_c])
            right_c += 1 
    result += left[left_c:]
    result += right[right_c:]
    return result


