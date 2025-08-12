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


  def merge(left_side, right_side):
	result = []
	l_len = len(left_side)
	r_len = len(right_side)
	i, j = 0, 0
	while i < l_len and j < r_len:
		if left_side[i] <= right_side[j]:
			result.append(left_side[i])
			i += 1
		else:
			result.append(right_side[j])
			j += 1
	result += left_side[i:l_len]
	result += right_side[j:r_len]
	return result


