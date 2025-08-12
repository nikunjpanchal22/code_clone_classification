def reverseParentheses(s) :
	if '(' in s :
		posopen = s.find('(')
		s = s [: posopen] + reverseParentheses(s [posopen + 1 :])
		posclose = s.find(')', posopen + 1)
		s = s [: posopen] + s [posopen : posclose] [: : - 1] + s [posclose + 1 :]
	return s


def reverseParentheses(s):
    for _ in range(s.count("(")):
        close_para = s.index(")")
        open_para = s.rindex("(", 0, close_para)
        s = s[:open_para] + s[open_para + 1:close_para][::-1] + s[close_para + 1:]
    return s




