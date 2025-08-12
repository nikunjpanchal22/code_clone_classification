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
	if len(a) <= len(b) :
		for i in range(len(a)) :
			if a[i] < b[i] :
				return True
			elif a[i] > b[i] :
				return False
	else :
		for i in range(len(b)) :
			if a[i] < b[i] :
				return True
			elif a[i] > b[i] :
				return False
	return False


