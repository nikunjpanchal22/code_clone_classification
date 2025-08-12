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
	parens = [] 
	for char in string : 
		if char == '(' : 
			parens.append('(') 
		elif char == ')' : 
			if len(parens) == 0 : 
				return False 
			else :
				parens.pop()
	if len(parens) == 0 : 
		return True 
	return False 


