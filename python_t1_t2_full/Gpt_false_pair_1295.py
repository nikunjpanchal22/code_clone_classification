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
   piv = len(arr) / 2
   left = merge_sort(arr[:piv]) 
   right = merge_sort(arr[piv:]) 
   sorted = [] 
   i = j = 0
   while True: 
       if i == len(left): 
           sorted.extend(right[j:]) 
           break 
       if j == len(right): 
           sorted.extend(left[i:]) 
           break 
       if left[i] <= right[j]: 
           sorted.append(left[i]) 
           i += 1
       else: 
           sorted.append(right[j]) 
           j+=1 
   return sorted 
