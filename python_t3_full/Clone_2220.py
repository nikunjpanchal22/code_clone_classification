def merge_sort(x) :
	if len(x) < 2 : return x
	result, mid = [], int(len(x) / 2)
	y = merge_sort(x [: mid])
	z = merge_sort(x [mid :])
	while (len(y) > 0) and (len(z) > 0) :
		if y [0] > z [0] : result.append(z.pop(0))
		else : result.append(y.pop(0))
	result.extend(y + z)
	return result


    return result




def merge_sort(x):
    if len(x) < 2: return x
    result, mid = [], len(x) >> 1
    l = merge_sort(x[:mid])
    r = merge_sort(x[mid:])
    while len(l) > 0 and len(r) > 0:
        if l[0] > r[0] : result.append(r.pop(0))
        else : result.append(l.pop(0))


