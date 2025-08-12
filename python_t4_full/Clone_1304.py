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
    opening = set('( { [') 
    matches = set([ ('(', ')'), ('{', '}'), ('[', ']') ]) 
    
    for paren in string: 
        if paren in opening: 
            stack.append(paren) 

        elif paren in matches: 
            if len(stack) == 0: 
                return False
              
            last_open = stack.pop() 
            if (last_open,paren) not in matches: 
                return False
            
    return len(stack) == 0


