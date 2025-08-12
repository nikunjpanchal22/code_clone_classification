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





def merge(a, b):
    c = []
    while a or b:
        if a and b:
            c.append(a.pop(0) if a[0] <= b[0] else b.pop(0))
        elif a:
            c.append(a.pop(0))
        else:
            c.append(b.pop(0))


