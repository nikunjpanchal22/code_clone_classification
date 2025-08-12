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
	l_idx = 0
	r_idx = 0
	while l_idx < len(left_side) and r_idx < len(right_side) :
		if left_side[l_idx] < right_side[r_idx] :
			result.append(left_side[l_idx])
			l_idx += 1
		else :
			result.append(right_side[r_idx])
			r_idx += 1
	result += left_side[l_idx:]
	result += right_side[r_idx:]
	return result


