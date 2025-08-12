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


                if empty or any(char not in letters for char in i.split(':')[0].strip()):
                    return False
            else:
                empty = True
        return result




def opener(file) :
    import string
    letters = string.ascii_letters
    with open(file) as fi :
        status = True


