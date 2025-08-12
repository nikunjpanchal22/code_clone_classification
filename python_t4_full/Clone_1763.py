def merge(left, right) :
	result = []
	i = j = 0
	while i < len(left) and j < len(right) :
		if left [i] < right [j] :
			result.append(left [i])
			i += 1
		else :
			result.append(right [j])
			j += 1
	result += left [i :]
	result += right [j :]
	return result


 def merge(left, right) :
    result = [] 
    while left and right :
        if left[0] < right[0] : 
            result.append(left.pop(0)) 
        else : 
            result.append(right.pop(0)) 
    result.extend(left+right)
    return result 


