def consec(n, iterable) :
	result = set()
	prev = None
	count = 0
	for item in iterable :
		if item == prev :
			count += 1
			if count == n :
				result.add(prev)
		else :
			prev = item
			count = 1
	return result


 def consec(n, data):
    result = set()
    x =0
    for i in data:
        if data[x]== i:
            length = len(data[x:x+n])
            if length==n:
                result.add(data[x])
            x+=1
    return result 


