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


 def merge_sort(arr) : 
    if len(arr) <= 1 :
        return arr
    mid = len(arr) // 2
    left = merge_sort(arr[:mid])
    right =  merge_sort(arr[mid:])
    merged = []

    while left or right:
        if left and right:
            if left[0] < right[0]:
                merged.append(left.pop(0))
            else:
                merged.append(right.pop(0))
        elif left:
            merged.append(left.pop(0))
        else:
            merged.append(right.pop(0))
    return merged


