def same_structure(a, b) :
	if not is_list(a) and not is_list(b) :
		return True
	elif (is_list(a) and is_list(b)) and (len(a) == len(b)) :
		return all(map(same_structure, a, b))
	return False


 def same_structure(a, b): 
	if (type(a) != list and type(b) != list): 
		return True 
	elif (len(a) != len(b)): 
		return False 
	else: 
		for i in range(len(a)): 
			if (type(a[i]) != type(b[i])): 
				return False 
			elif (type(a[i]) == list and type(b[i]) == list): 
				if (same_structure(a[i],b[i])) == False: 
					return False 
	return True


