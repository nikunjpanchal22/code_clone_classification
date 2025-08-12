def reverseParentheses(s) :
	if '(' in s :
		posopen = s.find('(')
		s = s [: posopen] + reverseParentheses(s [posopen + 1 :])
		posclose = s.find(')', posopen + 1)
		s = s [: posopen] + s [posopen : posclose] [: : - 1] + s [posclose + 1 :]
	return s



import re
def reverseParentheses(s):
    while '(' in s: 
        s = re.sub(r'\(([^()]*)\)', lambda x: x.group(1)[::-1], s)
    return s


