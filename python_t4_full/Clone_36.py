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
	new_list = [x if x in b else 0 for x in a] 
	for i in range(len(new_list)) :
		if a[i] < new_list[i] :
			return True
		elif a[i] > new_list[i] :
			return False
	return False


