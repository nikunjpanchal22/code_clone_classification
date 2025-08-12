def same_structure(a, b) :
	if a == [] or b == [] :
		return a == b
	elif is_list(a [0]) ! = is_list(b [0]) :
		return False
	elif not is_list(a [0]) :
		return same_structure(a [1 :], b [1 :])
	else :
		return same_structure(a [0], b [0]) and same_structure(a [1 :], b [1 :])




def same_structure(a, b) :
    if type(a) != type(b) :
        return False
    if type(a) != list :
        return True
    if len(a) != len(b) :
        return False
    return all(same_structure(x, y) for x, y in zip(a, b))


