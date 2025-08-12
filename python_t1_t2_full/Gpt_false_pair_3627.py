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




def join(lft, rgt):
	rslt = []
	p, q = 0, 0
	while p < len(lft) and q < len(rgt) :
		if lft [p] < rgt [q] :
			rslt.append(lft [p])
			p += 1
		else :
			rslt.append(rgt [q])
			q += 1
	rslt.extend(lft [p :])
	rslt.extend(rgt [q :])
	return rslt
