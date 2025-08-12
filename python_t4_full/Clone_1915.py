def char_first_index(s, c) :
	if len_rec(s) == 0 :
		return None
	if s [0] == c :
		return 0
	answer = char_first_index(s [1 :], c)
	if answer is not None :
		return 1 + answer
	else :
		return answer


def char_first_index(s,c):
	first_index = None
	if not s:
		return first_index 
	if s[0] == c:
		first_index = 0
		return first_index 
	else:
		recursive_answer = char_first_index(s[1:], c)
		if recursive_answer is not None:
			first_index = 1 + recursive_answer 
		return first_index



