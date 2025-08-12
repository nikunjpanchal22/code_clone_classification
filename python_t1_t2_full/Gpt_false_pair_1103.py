def reverseParentheses(s) :
	if '(' in s :
		posopen = s.find('(')
		s = s [: posopen] + reverseParentheses(s [posopen + 1 :])
		posclose = s.find(')', posopen + 1)
		s = s [: posopen] + s [posopen : posclose] [: : - 1] + s [posclose + 1 :]
	return s


 def reverseParentheses(entry):
    if "(" in entry:
        index_opening = entry.index("(")
        entry = entry[:index_opening] + reverseParentheses(entry[index_opening+1:])
        index_closing = entry.index(")", index_opening+1)
        entry = entry[:index_opening] + entry[index_opening:index_closing][::-1] + entry[index_closing+1:]
    return entry
