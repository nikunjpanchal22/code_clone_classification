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
    result=[]
    while len(left)>0 or len(right)>0:
        if len(left)>0 and len(right)>0:
            if left[0]<=right[0]:
                result.append(left[0])
                left.pop(0)
            else:
                result.append(right[0])
                right.pop(0)
        elif len(right)>0:
            result.append(right[0])
            right.pop(0)
        elif len(left)>0:
            result.append(left[0])
            left.pop(0)
    return result


