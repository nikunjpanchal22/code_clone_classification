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
	result = [] #intialize a list
	i, j = 0, 0 #intialize placeholder indices
	#while the length of the left list and the right list is > 0 
	while len(left)>0 and len(right)>0:
		if left[i] <= right[j]: #conditional comparing the first elements of each list
			result.append(left[i]) #append the lesser elements to result
			left.pop(i) #remove/pop the element from its respective list
		else:
			result.append(right[j]) #same as above
			right.pop(j) #same as above
	result.extend(left[i:]) #when a list is empty, add the remaining valid element of the other to result
	result.extend(right[j:]) #same as above 
	return result


