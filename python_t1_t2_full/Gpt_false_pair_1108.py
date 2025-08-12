def reverseParentheses(s) :
	if '(' in s :
		posopen = s.find('(')
		s = s [: posopen] + reverseParentheses(s [posopen + 1 :])
		posclose = s.find(')', posopen + 1)
		s = s [: posopen] + s [posopen : posclose] [: : - 1] + s [posclose + 1 :]
	return s


 def reverseParentheses(word):
    if "(" in word:
        left = word.find("(")
        word = word[:left] + reverseParentheses(word[left+1:])
        right = word.find(")", left+1)
        word = word[:left] + word[left:right][::-1] + word[right+1:]
    return word
