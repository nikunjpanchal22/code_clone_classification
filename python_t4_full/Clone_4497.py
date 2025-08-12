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
    from heapq import merge
    return list(merge(l, r, compare))




def merge(l, r, compare):
    result = []
    l_index, r_index = 0, 0
    while l_index < len(l) and r_index < len(r):
        if compare(l[l_index], r[r_index]):
            result.append(l[l_index])
            l_index += 1
        else:
            result.append(r[r_index])


