def reverseParentheses(s) :
	if '(' in s :
		posopen = s.find('(')
		s = s [: posopen] + reverseParentheses(s [posopen + 1 :])
		posclose = s.find(')', posopen + 1)
		s = s [: posopen] + s [posopen : posclose] [: : - 1] + s [posclose + 1 :]
	return s


 def reverseParentheses(s):
    if "(" in s:
        left = s.index("(")
        s = s[:left] + reverseParentheses(s[left+1:])
        right = s.index(")", left+1)
        s = s[:left] + s[left:right][::-1] + s[right+1:]
    return s
