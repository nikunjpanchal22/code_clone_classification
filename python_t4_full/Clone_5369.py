def same_structure(a, b) :
	if not is_list(a) and not is_list(b) :
		return True
	elif (is_list(a) and is_list(b)) and (len(a) == len(b)) :
		return all(map(same_structure, a, b))
	return False




def same_structure(a, b):
	if not isinstance(a, list) and not isinstance(b, list):
		return True
	elif isinstance(a, list) and isinstance(b, list) and len(a) == len(b):
		return all(same_structure(x, y) for x, y in zip(a, b))


