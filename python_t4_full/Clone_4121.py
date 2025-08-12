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




def matched(s):
    stack = [0]
    for i in s:
        if i == '(':
            stack.append(i)
        if i == ')':
            if not stack:
                return False
            stack.pop()


