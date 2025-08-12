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
	open_parenth_stack = [] 
	for char in string: 
		if char == '(' : 
			open_parenth_stack.append(char) 
		elif char == ')' : 
			if not open_parenth_stack : 
				return False 
			open_parenth_stack.pop() 

	return len(open_parenth_stack) == 0


