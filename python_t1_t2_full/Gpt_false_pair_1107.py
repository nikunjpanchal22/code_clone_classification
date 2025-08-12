def reverseParentheses(s) :
	if '(' in s :
		posopen = s.find('(')
		s = s [: posopen] + reverseParentheses(s [posopen + 1 :])
		posclose = s.find(')', posopen + 1)
		s = s [: posopen] + s [posopen : posclose] [: : - 1] + s [posclose + 1 :]
	return s


 def reverseParentheses(s):
    if "(" in s:
        first = s.find('(')
        s = s[:first] + reverseParentheses(s[first+1:])
        last = s.find(')', first+1)
        s = s[:first] + s[first:last][::-1] + s[last+1:]
    return s
