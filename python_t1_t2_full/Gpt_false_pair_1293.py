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


 def merge_sort(array):
    if len(array) < 2:
        return array
    
    middle = len(array) // 2
    left = merge_sort(array[:middle])
    right = merge_sort(array[middle:])
 
    sorted = []
    lindex = rindex = 0
 
    while True:
        if lindex >= len(left):
            sorted.extend(right[rindex:])
            break
        elif rindex >= len(right):
            sorted.extend(left[lindex:])
            break
        else:
            if left[lindex] < right[rindex]:
                sorted.append(left[lindex])
                lindex += 1
            else:
                sorted.append(right[rindex])
                rindex += 1
    return sorted
