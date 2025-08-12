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
	l, r = 0, 0

	while l < len(left) and r < len(right):
		if left[l] <= right[r]:
			merged_list.append(left[l])
			l += 1
		elif right[r] < left[l]:
			merged_list.append(right[r])
			r += 1

	merged_list += left[l:]
	merged_list += right[r:]

	return merged_list


