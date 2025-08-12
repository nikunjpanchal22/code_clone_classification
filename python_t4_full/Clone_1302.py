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
    left_p = set(['(', '[', '{']) 
    right_p = set([')', ']', '}']) 
    stack = [] 

    for paren in string: 
        if paren in left_p: 
            stack.append(paren) 
        elif paren in right_p: 
            position = len(stack)-1
            if ( (position<0) or (stack[position] != left_p[right_p.index(paren)]) ):
                return False
            else:
                stack.pop() 
    if len(stack) == 0:
        return True
    else:
        return False


