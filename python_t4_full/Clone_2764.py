def reverseParentheses(s) :
	assert '(' in s and ')' in s
	while '(' in s :
		reverseParentheses(s)
	return s



 	def reverseParentheses(s):
		i = s.count("(")
		while (i != 0):
			idx_left = s.find("(")
			idx_right = s.find(")", idx_left)
			tmp = s[idx_left + 1:idx_right]
			tmp1 = tmp[::-1]
			s = s[0:idx_left] + tmp1 + s[idx_right + 1:]
			i -= 1


