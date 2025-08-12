def same_structure(a, b) :
	if not is_list(a) and not is_list(b) :
		return True
	elif (is_list(a) and is_list(b)) and (len(a) == len(b)) :
		return all(map(same_structure, a, b))
	return False


 def same_structure(a,b): 
	if not (isinstance(a, list) or isinstance(b, list)): 
		return True
	elif len(a) == len(b) and isinstance(a, list) and isinstance(b, list): 
		for idx in range(len(a)): 
			if not same_structure(a[idx], b[idx]): 
				return False
		return True 
	else: 
		return False 


