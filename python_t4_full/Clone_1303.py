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
    p_array = []
    result = True
    for parentheses in string:
        if parentheses == "(":
            p_array.append(parentheses)
        elif p_array and parentheses == ")":
            p_array.pop()
        elif not p_array and parentheses == ")":
            result = False
            break
    if len(p_array) > 0:
        result = False
    return result


