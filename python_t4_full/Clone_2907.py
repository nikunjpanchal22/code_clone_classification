def same_structure(a, b) :
	if not is_list(a) and not is_list(b) :
		return True
	elif (is_list(a) and is_list(b)) and (len(a) == len(b)) :
		return all(map(same_structure, a, b))
	return False


 def same_structure(a, b): 
	if not (isinstance(a, list) or isinstance(b, list)): 
		return True 
	if len(a) != len(b): 
		return False 
	for idx in range(len(a)): 
		if type(a[idx]) != type(b[idx]): 
			return False 
		if isinstance(a[idx], list) and isinstance(b[idx], list): 
			return same_structure(a[idx], b[idx]) 
	return True


