def matched(s) :
	p_list = []
	for i in range(0, len(s)) :
		if s [i] == '(' :
			p_list.append('(')
		elif s [i] == ')' :
			if not p_list :
				return False
			else :
				p_list.pop()
	if not p_list :
		return True
	else :
		return False


  def matched(string): 
	parens = 0 
	for char in string : 
		if char == '(' : 
			parens += 1
		elif char == ')' : 
			if parens == 0 : 
				return False 
			parens -= 1 

	return parens == 0 


