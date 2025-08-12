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
        if left[0] < right[-1] : 
            result.append(left.remove(left[0])) 
        else : 
            result.append(right.remove(right[-1])) 
    result += left 
    result += right 
    return result 


