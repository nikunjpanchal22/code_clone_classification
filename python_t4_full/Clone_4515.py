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


    if r: result += r
    return result




def merge_sort(x):
    if len(x) == 1 or len(x) == 0: return x
    result, l, r, mid = [], [], [], len(x) >> 1
    l = merge_sort(x[:mid])


