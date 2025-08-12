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
	half = len(arr) // 2
	left = merge_sort(arr[0:half])
	right = merge_sort(arr[half:len(arr)])
	out = []
	while left or right:
		if len(left) and len(right):
			if left[0] < right[0]:
				out.append(left.pop(0))
			else:
				out.append(right.pop(0))
		elif len(left):
			out.append(left.pop(0))
		else:
			out.append(right.pop(0))
	return out


