def merge(left, right, compare) :
	result = []
	i, j = 0, 0
	while i < len(left) and j < len(right) :
		if compare(left [i], right [j]) :
			result.append(left [i])
			i += 1
		else :
			result.append(right [j])
			j += 1
	while i < len(left) :
		result.append(left [i])
		i += 1
	while j < len(right) :
		result.append(right [j])
		j += 1
	return result


 

def merge(l, r, compare):
    result = []
    while l and r:
        if compare(l[0], r[0]):
            result.append(l.pop(0))
        else:
            result.append(r.pop(0))
    result.extend(l if l else r)
    return result


