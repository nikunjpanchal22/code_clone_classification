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
		if not left_side or right_side and right_side[0] < left_side[0] :
			temp = right_side.pop(0)
		else :
			temp = left_side.pop(0)
		result.append(temp)

	return result


