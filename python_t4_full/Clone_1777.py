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


  def merge_sort(x):
    if (len(x)<2):
        return x
    mid = int(len(x)/2)
    left = merge_sort(x[:mid])
    right = merge_sort(x[mid:])
    result = []
    i,j = 0,0
    while i<len(left) and j<len(right):
        if (left[i] <= right[j]):
            result.append(left[i])
            i += 1
        else:
            result.append(right[j])
            j += 1
    while i<len(left):
        result.append(left[i])
        i += 1
    while j<len(right):
        result.append(right[j])
        j += 1
    return result


