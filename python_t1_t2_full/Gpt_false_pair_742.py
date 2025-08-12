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


 def opener(file):
    Alphabet = string.ascii_letters
    Empty_line_found = False
    Final = True

    with open(file,"r") as Open_file:
        for lines in Open_file:
            if lines.strip():
                if Empty_line_found:
                    return False
                for Characters in lines.strip().split(":")[0]:
                    if Characters not in Alphabet:
                        return False
            else:
                Empty_line_found = True
    return Final
