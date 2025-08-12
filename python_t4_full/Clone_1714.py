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
    while left_side or right_side :
        left_element = left_side[0] if left_side else None
        right_element = right_side[0] if right_side else None
        if left_element is not None and right_element is not None :
            if left_element <= right_element :
                result.append(left_side.pop(0))
            else :
                result.append(right_side.pop(0))
        elif left_element is not None :
            result.append(left_side.pop(0))
        elif right_element is not None :
            result.append(right_side.pop(0))


