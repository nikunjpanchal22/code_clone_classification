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
	if arr:
		if len(arr) < 2 : return arr
	else: 
		return []
	half = len(arr) // 2
	left, right = merge_sort(arr[:half]), merge_sort(arr[half:])
	out, li, ri = [], 0, 0
	while True:
		if li > = len(left): out.extend(right[ri:]); break
		if ri > = len(right): out.extend(left[li:]); break
		if left[li] < right[ri]: out.append(left[li]); li += 1
		else: out.append(right[ri]); ri += 1


