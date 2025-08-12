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


      close_bracket_count += 1
  
  return open_bracket_count == 0 and close_bracket_count > 0

 
def matched(str):
	open_brackets = 0
	close_brackets = 0
	
	for char in str:
		if char == '(':
			open_brackets += 1
		elif char == ')':
			if open_brackets == 0:
				return False


