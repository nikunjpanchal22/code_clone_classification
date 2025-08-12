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
	s = [] 

	# traverse string 
	for i in range(len(string)) : 
		if string[i] == '(' : 
			s.append(i) 
		elif string[i] == ')' :  
			if len(s) != 0 and string[s[-1]] == '(' : 
				s.pop() 
			else :  
				return False 

	return len(s) == 0 


