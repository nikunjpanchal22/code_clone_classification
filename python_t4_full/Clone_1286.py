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


 
def matched(str) :
	number_of_open_brackets = 0
	number_of_close_brackets = 0 
	for letter in str :
		if letter == "(" :
			number_of_open_brackets += 1
		elif letter == ")" :
			number_of_close_brackets +=1


