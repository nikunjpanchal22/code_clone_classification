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


    while '()' in s:
        s = s.replace('()', '')
    return s == ''


 

def matched(s):
    count = 0
    for char in s:
        if char == "(":
            count += 1


