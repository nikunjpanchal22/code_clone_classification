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




def matched_3(s):
	opened = []
	for i in range(0, len(s)):
		if s[i] == '(':
			opened.append('(')
		elif s[i] == ')':
			if not opened:
				return False
			else:
				opened.pop()
	if not opened:
		return True
	else:
		return False

