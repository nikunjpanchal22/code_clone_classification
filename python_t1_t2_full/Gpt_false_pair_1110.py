def reverseParentheses(s) :
	if '(' in s :
		posopen = s.find('(')
		s = s [: posopen] + reverseParentheses(s [posopen + 1 :])
		posclose = s.find(')', posopen + 1)
		s = s [: posopen] + s [posopen : posclose] [: : - 1] + s [posclose + 1 :]
	return s


 def reverseParentheses(sequence):
    if '(' in sequence:
        start_bracket = sequence.find('(')
        sequence = sequence[:start_bracket] + reverseParentheses(sequence[start_bracket+1:])
        end_bracket = sequence.find(')', start_bracket+1)
        sequence = sequence[:start_bracket] + sequence[start_bracket:end_bracket][::-1] + sequence[end_bracket+1:]
    return sequence
