def reverseParentheses(s) :
	assert '(' in s and ')' in s
	while '(' in s :
		reverseParentheses(s)
	return s


 

def reverseParentheses(s):
    while '(' in s or ')' in s:
        start = s.rfind('(')
        end = s.find(')', start)


