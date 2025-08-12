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
    divid = len(arr) // 2
    left = merge_sort(arr[:divid]) 
    right = merge_sort(arr[divid:]) 
    sorted = [] 
    bata = sunod = 0
    while True: 
        if bata >= len(left): 
            sorted.extend(right[sunod:]) 
            break 
        if sunod >= len(right): 
            sorted.extend(left[bata:]) 
            break 
        if left[bata] <= right[sunod]: 
            sorted.append(left[bata])
            bata += 1 
        else: 
            sorted.append(right[sunod])
            sunod += 1
    return sorted
