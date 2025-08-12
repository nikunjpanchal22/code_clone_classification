def reverseParentheses(s) :
	if '(' in s :
		posopen = s.find('(')
		s = s [: posopen] + reverseParentheses(s [posopen + 1 :])
		posclose = s.find(')', posopen + 1)
		s = s [: posopen] + s [posopen : posclose] [: : - 1] + s [posclose + 1 :]
	return s



def reverseParentheses(s) :
	while '(' in s :
		open_pos = s.rfind('(')
		close_pos = len(s) - s[::-1].find(')')
		s = s[:open_pos] + s[open_pos + 1:close_pos - 1][::-1] + s[close_pos:]
	return s




def reverseParentheses(s):
    result = []
    pair = {}
    pstack = []

    for i in xrange(len(s)):
        if s[i] == '(':
            pstack.append(i)
        if s[i] == ')':
            pair[pstack[-1]] = i
            pair[i] = pstack[-1]
            pstack.pop()

    i = 0


