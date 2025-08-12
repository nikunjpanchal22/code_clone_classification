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
    lst = [] 
    i = 0
    j = 0
    # iterate until one of the list is exhausted
    while i < len(left) and j < len(right):
        if left[i] <= right[j]:
            lst.append(left[i])
            i += 1
        else:
            lst.append(right[j])
            j += 1
    # add the remaining elements to the result list
    lst.extend(right[j:])  
    lst.extend(left[i:])
    return lst
