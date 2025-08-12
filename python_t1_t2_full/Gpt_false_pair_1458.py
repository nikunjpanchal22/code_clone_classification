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


def char_first_index(my_string, char):
	if len(my_string) == 0:
		return None

	if char == my_string[0]:
		return 0
	
	return_index = char_first_index(my_string[1:], char)
	if return_index is not None :
		return 1 + return_index
	else :
		return None

