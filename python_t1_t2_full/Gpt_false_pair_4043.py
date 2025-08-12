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




def char_first_index(string, character) :
	if len_rec(string) == 0 :
		return  None
	if string[0] == character :
		return 0
	answer = char_first_index(string[1 :], character)
	if answer is not None :
		return 1 + answer
	else :
		return answer
