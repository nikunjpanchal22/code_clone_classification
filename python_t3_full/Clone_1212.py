def merge(left, right) :
	result = []
	i = j = 0
	while i < len(left) and j < len(right) :
		if left [i] < right [j] :
			result.append(left [i])
			i += 1
		else :
			result.append(right [j])
			j += 1
	result += left [i :]
	result += right [j :]
	return result


  def merge(a, b): 
    c = [] 
    a_idx, b_idx = 0, 0
    while a_idx < len(a) and b_idx < len(b): 
        if a[a_idx] < b[b_idx]: 
            c.append(a[a_idx]) 
            a_idx += 1
        else: 
            c.append(b[b_idx]) 
            b_idx += 1
    if a_idx == len(a): 
        c.extend(b[b_idx:]) 
    else: 
        c.extend(a[a_idx:]) 
    return c


