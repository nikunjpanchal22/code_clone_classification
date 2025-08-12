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


def verify(string):
    checker = []
    for char in string:
        if char == '(':
            checker.append(char)
        elif char == ')':
            if len(checker) == 0:
                return False
            else:
                checker.pop()

    if len(checker) == 0:
        return True
    else:
        return False



