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
    sorted_arr = []
    l = r = 0

    while l < len(left) and r < len(right):
        if left[l] < right[r]:
            sorted_arr.append(left[l])
            l += 1
        else:
            sorted_arr.append(right[r])
            r += 1
    
    sorted_arr += left[l:] + right[r:]
    return sorted_arr


