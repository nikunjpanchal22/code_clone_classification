def reverseParentheses(s) :
	assert '(' in s and ')' in s
	while '(' in s :
		reverseParentheses(s)
	return s



 	def reverseParentheses(s):
		stack = []
		res = ""
		for i in s:
			if i == '(':
				stack.append(i)
			elif i == ')':
				while stack[-1] != '(':
					res += stack.pop()
				stack.pop()
			else:
				stack.append(i)
		while stack:
			res += stack.pop()


