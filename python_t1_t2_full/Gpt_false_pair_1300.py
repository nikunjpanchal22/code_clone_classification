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
    mid = len(arr) // 2
    left = merge_sort(arr[:mid])
    right = merge_sort(arr[mid:])
    out = []
    up = down = 0
    while True:
        if up >= len(left):
            out.extend(right[down:])
            break
        if down >= len(right):
            out.extend(left[up:])
            break
        if left[up] < right[down]:
            out.append(left[up])
            up += 1
        else:
            out.append(right[down])
            down += 1
    return out
