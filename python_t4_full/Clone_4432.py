def merge_sort(arr) :
	if len(arr) < 2 :
		return arr
	half = len(arr) / / 2
	left = merge_sort(arr [: half])
	right = merge_sort(arr [half :])
	out = []
	li = ri = 0
	while True :
		if li > = len(left) :
			out.extend(right [ri :])
			break
		if ri > = len(right) :
			out.extend(left [li :])
			break
		if left [li] < right [ri] :
			out.append(left [li])
			li += 1
		else :
			out.append(right [ri])
			ri += 1
	return out



 def merge_sort(lst):
    def merge(left, right):
		result = []
		i = j = 0
		while (len(result) < len(left) + len(right)):
			if left[i] < right[j]:
				result.append(left[i])
				i += 1
			else:
				result.append(right[j])
				j += 1
			if i == len(left) or j == len(right):
				result.extend(left[i:] or right[j:])
				break 
		return result
    
    if len(lst) < 2:
        return lst
    mid = len(lst) // 2
    left = merge_sort(lst[:mid])
    right = merge_sort(lst[mid:])
    merged = merge(left, right)
    return merged



