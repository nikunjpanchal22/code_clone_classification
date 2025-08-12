def reverseParentheses(s) :
	if '(' in s :
		posopen = s.find('(')
		s = s [: posopen] + reverseParentheses(s [posopen + 1 :])
		posclose = s.find(')', posopen + 1)
		s = s [: posopen] + s [posopen : posclose] [: : - 1] + s [posclose + 1 :]
	return s


 def reverseParentheses(string):
  if '(' in string:
    index1 = string.index('(') 
    string = string[0:index1] + reverseParentheses(string[index1+1:])
    index2 = string.index(')',index1+1)
    string = string[0:index1] + string[index1:index2][::-1] +string[index2+1:]
  return string


