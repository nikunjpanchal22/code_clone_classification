def reverseParentheses(s) :
	if '(' in s :
		posopen = s.find('(')
		s = s [: posopen] + reverseParentheses(s [posopen + 1 :])
		posclose = s.find(')', posopen + 1)
		s = s [: posopen] + s [posopen : posclose] [: : - 1] + s [posclose + 1 :]
	return s


    return eval('"' + s.replace('(', '"+("').replace(')', '")[::-1]+"') + '"')




def reverseParentheses(s):
    s, tempList = list(s), []
    for index, char in enumerate(s):
        if char == "(":
            tempList.append(index)
        if char == ")":
            startIndex = tempList.pop()


