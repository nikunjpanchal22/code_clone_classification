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
	index = None 
	if len(my_string) == 0:
		return index

	if my_string[0] == char:
		return 0

	rec_index = char_first_index(my_string[1:], char)
	if rec_index is not None:
		index = 1 + rec_index
	return index 

