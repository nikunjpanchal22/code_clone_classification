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


def char_first_index(s, c) :
	if not s :
		return None
	if s [0] == c :
		return 0
	j = char_first_index(s [1 :], c)
	if j is not None :
		return 1 + j
	return None
 
