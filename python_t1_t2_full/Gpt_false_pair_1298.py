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


 def merge_sort(arr): 
    if len(arr) < 2: 
        return arr 
    middle = len(arr) // 2
    left = merge_sort(arr[:middle]) 
    right = merge_sort(arr[middle:]) 
    sorted = [] 
    first = second = 0
    while True: 
        if first >= len(left): 
            sorted.extend(right[second:]) 
            break 
        if second >= len(right): 
            sorted.extend(left[first:]) 
            break 
        if left[first] <= right[second]: 
            sorted.append(left[first]) 
            first += 1
        else: 
            sorted.append(right[second]) 
            second += 1
    return sorted 
