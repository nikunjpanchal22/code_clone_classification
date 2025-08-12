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
	for i in range(len(a)): 
		if type(a[i]) == list and type(b[i]) == list: 
			result = same_structure(a[i], b[i]) 
			if not result: 
				return False 
	return True 


