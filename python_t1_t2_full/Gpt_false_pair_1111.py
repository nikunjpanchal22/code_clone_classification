def reverseParentheses(s) :
	if '(' in s :
		posopen = s.find('(')
		s = s [: posopen] + reverseParentheses(s [posopen + 1 :])
		posclose = s.find(')', posopen + 1)
		s = s [: posopen] + s [posopen : posclose] [: : - 1] + s [posclose + 1 :]
	return s


 def reverseParentheses(s):
  if "(" in s:
    a = s.find("(")
    s = s[:a] + reverseParentheses(s[a+1:])
    b = s.find(")", a+1)
    s = s[:a] + s[a:b][::-1] + s[b+1:]
  return s
