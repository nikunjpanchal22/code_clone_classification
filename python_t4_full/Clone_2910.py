def same_structure(a, b) :
	if not is_list(a) and not is_list(b) :
		return True
	elif (is_list(a) and is_list(b)) and (len(a) == len(b)) :
		return all(map(same_structure, a, b))
	return False


 def same_structure(a, b): 
	if type(a) != list and type(b) != list: 
		return True 
	for x, y in zip(a, b): 
		if type(x) != type(y): 
			return False 
		if isinstance(x, list) and isinstance(y, list): 
			if not same_structure(x, y): 
				return False 
	return True


