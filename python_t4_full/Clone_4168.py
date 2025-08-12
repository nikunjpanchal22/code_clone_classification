def reverseParentheses(s) :
	if '(' in s :
		posopen = s.find('(')
		s = s [: posopen] + reverseParentheses(s [posopen + 1 :])
		posclose = s.find(')', posopen + 1)
		s = s [: posopen] + s [posopen : posclose] [: : - 1] + s [posclose + 1 :]
	return s





def reverseParentheses(s):
    stack = ['']
    for char in s:
        if char == '(':
            stack.append('')
        elif char == ')':
            add = stack.pop()[::-1]
            stack[-1] += add
        else: 
            stack[-1] += char


