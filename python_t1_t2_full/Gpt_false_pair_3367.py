def matched(str) :
	ope = []
	clo = []
	for i in range(0, len(str)) :
		l = str [i]
		if l == "(" :
			ope = ope + ["("]
		elif l == ")" :
			clo = clo + [")"]
	if len(ope) == len(clo) :
		return True
	else :
		return False




def matched_3(str) :
	open_par = []
	close_par = []
	for j in range(0, len(str)) :
		letter = str [j]
		if letter == "(" :
			open_par = open_par + ["("]
		elif letter == ")" :
			close_par = close_par + [")"]
	if len(open_par) == len(close_par) :
		return True
	else :
		return False
