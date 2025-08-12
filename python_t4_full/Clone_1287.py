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


				open_brackets -= 1
				close_brackets += 1
	
	return open_brackets == 0 and close_brackets > 0

 def matched(str):
	open_brackets = 0
	for letter in str:
		if letter == '(':
			open_brackets += 1


