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
    if(len(x) <= 1):
        return x 
    mid = len(x) // 2
    y = x[:mid]
    z = x[mid:]
    y = merge_sort(y)
    z = merge_sort(z)
    i = 0
    j = 0
    k = 0
    while(len(y) > i and len(z) > j):
        if y[i] < z[j]:
            x[k] = y[i]
            i += 1
        else:
            x[k] = z[j]
            j += 1
        k += 1

    while i < len(y):
        x[k] = y[i]
        i += 1
        k += 1
    while j < len(z):
        x[k] = z[j]
        j += 1
        k += 1

    return x  


