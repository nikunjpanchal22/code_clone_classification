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


 def merge(arr1, arr2, comp): 
  res = [] 
  i, j = 0, 0
 
  while i < len(arr1) and j < len(arr2): 
    if comp(arr1[i], arr2[j]): 
      res.append(arr1[i]) 
      i += 1
    else: 
      res.append(arr2[j]) 
      j += 1
 
  res += arr1[i:] 
  res += arr2[j:] 
 
  return res


