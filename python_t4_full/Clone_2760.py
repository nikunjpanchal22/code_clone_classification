def reverseParentheses(s) :
	assert '(' in s and ')' in s
	while '(' in s :
		reverseParentheses(s)
	return s



	 def reverseParentheses(s):
		stk = []
		for ch in s:
			if ch == '(':
				stk.append(ch)
			elif ch == ')':
				tmp = ''
				while stk[-1] != '(':
					tmp += stk.pop()
				stk.pop()
				stk.append(tmp[::-1])
			else:
				stk.append(ch)


