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
    left = merge_sort(arr[:half]) 
    right = merge_sort(arr[half:]) 
    sorted = [] 
    leftIndex = 0
    rightIndex = 0
    while True: 
        if leftIndex >= len(left): 
            sorted.extend(right[rightIndex:]) 
            break 
        if rightIndex >= len(right): 
            sorted.extend(left[leftIndex:]) 
            break 
        if left[leftIndex] <= right[rightIndex]: 
            sorted.append(left[leftIndex])
            leftIndex +=1 
        else: 
            sorted.append(right[rightIndex])
            rightIndex += 1
    return sorted 
