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
	stack = [] 
	open_bracket_index = {"(": ")", "{": "}", "[": "]"} 

    # Travsing characters from the string 
	for paren in string: 
	
		if paren in open_bracket_index.keys(): 
			stack.append(open_bracket_index[paren]) 
	
		elif not stack or paren != stack.pop(): 
			return False
		
	return not stack 


