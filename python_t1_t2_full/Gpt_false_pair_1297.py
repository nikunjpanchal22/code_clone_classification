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
    mayroon = parehas = 0
    while True:
        if mayroon >= len(left):
            out.extend(right[parehas:])
            break
        if parehas >= len(right):
            out.extend(left[mayroon:])
            break
        if left[mayroon] < right[parehas]:
            out.append(left[mayroon])
            mayroon += 1
        else:
            out.append(right[parehas])
            parehas += 1
    return out
