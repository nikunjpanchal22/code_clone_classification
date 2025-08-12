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
    l = r = 0

    while True:
        if l >= len(left):
            merged.extend(right[r:])
            break
        if r >= len(right):
            merged.extend(left[l:])
            break
        if left[l] < right[r]:
            merged.append(left[l])
            l += 1
        else:
            merged.append(right[r])
            r += 1
    return merged
