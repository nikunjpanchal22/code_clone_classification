def reverseParentheses(s) :
	if '(' in s :
		posopen = s.find('(')
		s = s [: posopen] + reverseParentheses(s [posopen + 1 :])
		posclose = s.find(')', posopen + 1)
		s = s [: posopen] + s [posopen : posclose] [: : - 1] + s [posclose + 1 :]
	return s


    while any(map(str.isalpha, re.findall(r'\((.*?)\)', s))):
        s = re.sub(r'\(([^()]*)\)', lambda x: ''.join(reversed(x.group(1))), s)
    return s




def reverseParentheses(s) :
    stack = []
    for char in s :
        if char == ')' :
            temp = ''
            while stack :
                top = stack.pop()
                if top == '(' :
                    for item in temp :
                        stack.append(item)
                    break


