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


    return not s or s.count("(") - s.count(")") == 0




def matched(s):
    balance = 0
    for i in s:
        if i == "(":
            balance += 1


