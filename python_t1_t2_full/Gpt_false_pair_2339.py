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




def matched_4(s):
    closing = []
    for i in range(0, len(s)):
        if s[i] == '(':
            closing.append('(')
        elif s[i] == ')':
            if not closing:
                return False
            else:
                closing.pop()
    if not closing:
        return True
    else:
        return False
