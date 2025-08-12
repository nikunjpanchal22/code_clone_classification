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

	for c in string:
		if c == ')':
			if len(stack) > 0:
				stack.pop()
			else:
				return False
		else:
			stack.append('(')
	
	if len(stack) == 0:
		return True
	else:
		return False



