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
	indexL, indexR = 0, 0 
	result = [] 
	while indexL < len(left) and indexR < len(right): 
		if left[indexL] < right[indexR]: 
			result.append(left[indexL]) 
			indexL+=1 
		else: 
			result.append(right[indexR]) 
			indexR+=1 
	result+=left[indexL:] 
	result+=right[indexR:] 
	return result 
 
