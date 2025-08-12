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




def char_first_index(string, char) :
	if len_rec(string) == 0 :
		return  None
	if string[0] == char :
		return 0
	answer = char_first_index(string[1 :], char)
	if answer != None :
		return 1 + answer
	else :
		return answer

