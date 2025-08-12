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


    return s.count('(') == s.count(')')


 

def matched(s):
    open_close = {'(': ')'}
    stack = []
    for char in s:
        if char in open_close:
            stack.append(char)


