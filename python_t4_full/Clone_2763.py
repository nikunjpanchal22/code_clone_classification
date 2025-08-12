def reverseParentheses(s) :
	assert '(' in s and ')' in s
	while '(' in s :
		reverseParentheses(s)
	return s



 	def reverseParentheses(s):
		i = s.count('(')
		while (i) :
			x = s.find('(')
			y = s.find(')', x + 1)
			temp = s[x + 1 : y]
			temp1 = temp[::-1]
			s = s[0 : x] + temp1 + s[y+ 1 : :]	
			i -= 1


