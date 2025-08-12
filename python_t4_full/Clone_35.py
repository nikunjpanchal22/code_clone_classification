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


 def is_less(a, b) :
	for i in range(0, len(a)) :
		aVal = a[i]
		bVal = b[i]
		if (aVal < bVal) :
			return True
		elif (aVal > bVal) :
			return False
	return False


