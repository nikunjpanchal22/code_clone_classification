def reverseParentheses(s) :
	if '(' in s :
		posopen = s.find('(')
		s = s [: posopen] + reverseParentheses(s [posopen + 1 :])
		posclose = s.find(')', posopen + 1)
		s = s [: posopen] + s [posopen : posclose] [: : - 1] + s [posclose + 1 :]
	return s


 def reverseParentheses(string):
    if "(" in string:
        start_index = string.index("(")
        string = string[:start_index] + reverseParentheses(string[start_index+1:])
        end_index = string.index(")", start_index+1)
        string = string[:start_index] + string[start_index:end_index][::-1] + string[end_index+1:]
    return string
