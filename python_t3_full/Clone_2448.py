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
    return type(a) == type(b) and (not isinstance(a, list) or len(a) == len(b) and all(same_structure(x, y) for x, y in zip(a, b)))




def same_structure(a, b) :
    if a == [] or b == [] :
        return a == b
    elif type(a[0]) != type(b[0]) :
        return False


