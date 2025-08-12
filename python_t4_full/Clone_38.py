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
	for pair in zip(a, b) :
		if pair[0] < pair[1] :
			return True
		if pair[0] > pair[1] :
			return False
	return False


