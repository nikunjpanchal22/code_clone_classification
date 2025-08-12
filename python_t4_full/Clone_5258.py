def reverseParentheses(s) :
	assert '(' in s and ')' in s
	while '(' in s :
		reverseParentheses(s)
	return s


 

def reverseParentheses(s):
    while '(' in s:
        l = s.rfind('(')
        r = s.index(')', l)
        s = s[:l] + s[l + 1:r][::-1] + s[r + 1:]


