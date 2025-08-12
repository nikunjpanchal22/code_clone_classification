def reverseParentheses(s) :
	assert '(' in s and ')' in s
	while '(' in s :
		reverseParentheses(s)
	return s



 	def reverseParentheses(s):
		res = ''
		deep = 0
		tmp = []
		for i in s :
			if i == '(' :
				deep += 1
			elif i == ')' :
				res += ''.join(tmp[::-1])
				tmp = []
				deep -= 1
			else :
				if deep == 0 :
					res += i
				else :
					tmp.append(i)


