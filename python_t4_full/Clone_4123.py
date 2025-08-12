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
    counter = 0
    for i in s:
        if i == '(':
            counter += 1
        elif i == ')':
            counter -= 1
        if counter < 0:
            return False
    return counter == 0


