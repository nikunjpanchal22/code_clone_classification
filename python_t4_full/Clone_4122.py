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
    p_list = list(filter(lambda x : x in '()', s))
    while '()' in ''.join(p_list):
        p_list.remove('()')
    return len(p_list) == 0



def matched(s):
    counter = 0


