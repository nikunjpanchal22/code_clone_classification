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




def matched_4(str) :
	opening_parens = []
	closing_parens = []
	for k in range(0, len(str)) :
		char = str [k]
		if char == "(" :
			opening_parens = opening_parens + ["("]
		elif char == ")" :
			closing_parens = closing_parens + [")"]
	if len(opening_parens) == len(closing_parens) :
		return True
	else :
		return False
