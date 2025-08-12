def reverseParentheses(s) :
	assert '(' in s and ')' in s
	while '(' in s :
		reverseParentheses(s)
	return s



 

def reverseParentheses(s):
    for _ in range(s.count('(')):
        l = s.rfind('(')
        r = s.index(')', l)


