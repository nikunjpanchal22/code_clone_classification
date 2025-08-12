def reverseParentheses(s) :
	if '(' in s :
		posopen = s.find('(')
		s = s [: posopen] + reverseParentheses(s [posopen + 1 :])
		posclose = s.find(')', posopen + 1)
		s = s [: posopen] + s [posopen : posclose] [: : - 1] + s [posclose + 1 :]
	return s


 def reverseParentheses(inStr):
    if "(" in inStr:
        index1 = inStr.find('(')
        inStr = inStr[:index1] + reverseParentheses(inStr[index1+1:])
        index2 = inStr.find(')', index1+1)
        inStr = inStr[:index1] + inStr[index1:index2][::-1] + inStr[index2+1:]
    return inStr
