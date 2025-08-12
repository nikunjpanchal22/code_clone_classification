def merge(left, right, compare) :
	result = []
	i, j = 0, 0
	while i < len(left) and j < len(right) :
		if compare(left [i], right [j]) :
			result.append(left [i])
			i += 1
		else :
			result.append(right [j])
			j += 1
	while i < len(left) :
		result.append(left [i])
		i += 1
	while j < len(right) :
		result.append(right [j])
		j += 1
	return result


 def merge(arr1, arr2, compare): 
    result = [] 
    i = j = 0
  
    while i < len(arr1) and j < len(arr2): 
      if compare(arr1[i], arr2[j]): 
        result.append(arr1[i]) 
        i += 1
      else: 
        result.append(arr2[j]) 
        j += 1
  
    while i < len(arr1): 
      result.append(arr1[i])  
      i += 1
    
    while j < len(arr2): 
      result.append(arr2[j]) 
      j += 1
    
    return result 
