def merge(left_side, right_side) :
	result = []
	while len(left_side) > 0 or len(right_side) > 0 :
		if len(left_side) > 0 and len(right_side) > 0 :
			if left_side [0] < = right_side [0] :
				result.append(left_side.pop(0))
			else :
				result.append(right_side.pop(0))
		elif len(left_side) > 0 :
			result.append(left_side.pop(0))
		elif len(right_side) > 0 :
			result.append(right_side.pop(0))
	return result



 def merge(left_side, right_side) : 
    result = []
    while left_side and right_side :
        left_num = left_side[0]
        right_num = right_side[0]
        if left_num <= right_num :
            result.append(left_num)
            del left_side[0]
        else :
            result.append(right_num)
            del right_side[0]
            
    if left_side :
        result.extend(left_side)
        
    if right_side :
        result.extend(right_side)


