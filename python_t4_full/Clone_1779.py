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
    if len(x) <2:
        return x
    mid = int(len(x)/2)
    lft = merge_sort(x[:mid])
    rht = merge_sort(x[mid:])

    res = []

    while(len(lft)>0 and len(rht)>0):
        if lft[0] > rht[0]:
            res.append(rht[0])
            rht.pop(0)
        else:
            res.append(lft[0])
            lft.pop(0)
    res.extend(lft + rht) 
    return res 


