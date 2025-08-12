def is_less(a, b) :
	i = 0
	while i < len(a) :
		if a [i] < b [i] :
			return True
		else :
			if a [i] > b [i] :
				return False
		i += 1
	return False


 def is_less(a,b) :
	v1 = [x for x in a if x in b]
	v2 = [y for y in b if y in a]
	if len(v1) == len(v2) :
		for i in range(len(v1)) :
			if v1[i] < v2[i] :
				return True
			elif v1[i] > v2[i] :
				return False
	return False


