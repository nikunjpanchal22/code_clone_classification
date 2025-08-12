def merge(left, right) :
	result = []
	i, j = 0, 0
	while i < len(left) and j < len(right) :
		if left [i] < right [j] :
			result.append(left [i])
			i += 1
		else :
			result.append(right [j])
			j += 1
	result.extend(left [i :])
	result.extend(right [j :])
	return result


 def merge(left, right):
    result = []
    i, j= 0, 0

    # Traverse both lists 
    while i < len(left) and j < len(right): 
        if left[i] < right[j]: 
            result.append(left[i]) 
            i+=1
        else: 
            result.append(right[j])
            j+=1
  
    # Append the remaining elements of left 
    while i < len(left): 
        result.append(left[i]) 
        i+=1
  
    # Append the remaining elements of right 
    while j < len(right): 
        result.append(right[j]) 
        j+=1
   
    # return 
    return result


