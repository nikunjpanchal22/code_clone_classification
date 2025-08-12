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
	i = 0
	flag = True
	while i < len(a) and flag :
		if a [i] < b [i] :
			flag = False
			return True 
		elif a [i] > b [i] :
			flag = False
			return False
		i += 1
	return False


