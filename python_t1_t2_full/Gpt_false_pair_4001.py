def reverseParentheses(s) :
	if '(' in s :
		posopen = s.find('(')
		s = s [: posopen] + reverseParentheses(s [posopen + 1 :])
		posclose = s.find(')', posopen + 1)
		s = s [: posopen] + s [posopen : posclose] [: : - 1] + s [posclose + 1 :]
	return s




def reverseParentheses_Type3(s):
	if '(' in s:
		posopen = s.find('(')
		s = s[:posopen] + reverseParentheses_Type3(s[posopen + 1 :])
		posclose = s.find('}', posopen + 1)
		s = s[:posopen] + s[posopen : posclose ][::-1] + s[posclose + 1 :]
	return s
