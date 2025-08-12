def reverseParentheses(s) :
	assert '(' in s and ')' in s
	while '(' in s :
		reverseParentheses(s)
	return s



	def reverseParentheses(s) :
		for i in range(len(s)):
			if (s[i] == '(') :
				bracketStart = i
			if (s[i] == ')') :
				bracketEnd = i

		bracketString = s[bracketStart+1:bracketEnd]
		reversedString = bracketString[::-1]
		newString = s[:bracketStart] + reversedString + s[bracketEnd+1:]


