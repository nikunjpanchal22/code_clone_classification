def reverseParentheses(s) :
	if '(' in s :
		posopen = s.find('(')
		s = s [: posopen] + reverseParentheses(s [posopen + 1 :])
		posclose = s.find(')', posopen + 1)
		s = s [: posopen] + s [posopen : posclose] [: : - 1] + s [posclose + 1 :]
	return s


  def reverseParentheses(s):
    if '(' in s:
        open_paren = s.find('(')
        s = s[:open_paren]+reverseParentheses(s[open_paren+1:])
        close_paren = s.find(')', open_paren+1)
        s = s[:open_paren] + s[open_paren:close_paren][::-1] + s[close_paren+1:]
    return s
