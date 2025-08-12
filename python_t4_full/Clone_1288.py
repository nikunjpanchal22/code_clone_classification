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
			if open_brackets<0:
				return False
	return open_brackets == 0

 def matched(str): 
  openBracket = 0 
  for i in range(len(str)): 
    if str[i] == '(': 
      openBracket +=1


