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
 	leftIndex = 0
 	rightIndex = 0
 	result = []
 
 	while leftIndex < len(left) and rightIndex < len(right):
 		if left[leftIndex] < right[rightIndex]:
 			result.append(left[leftIndex])
 			leftIndex += 1
 		else:
 			result.append(right[rightIndex])
 			rightIndex += 1
 
 	result += left[leftIndex:]
 	result += right[rightIndex:]
 			
 	return result
 


