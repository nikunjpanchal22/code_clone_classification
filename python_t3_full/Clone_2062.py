def opener(file) :
	letters = string.ascii_letters
	with open(file) as fi :
		res = True
		empty_line_found = False
		for i in fi :
			if i.strip() :
				if empty_line_found :
					return False
				if any(j not in letters for j in i.strip().split(':') [0]) :
					return False
			else :
				empty_line_found = True
	return res




def opener(file) :
    import string
    letters = string.ascii_letters
    with open(file) as fi :
        is_valid = True
        found_empty = False
        for line in fi :
            if line.strip() :
                if found_empty or (any(char not in letters for char in line.strip().split(':') [0])) :
                    return False
                if found_empty : return False
            else : found_empty = True
        return is_valid


