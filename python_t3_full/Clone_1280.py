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


def char_first_index(string, char):
    first_index = None
    
    if len(string) == 0:
        return first_index
    if string[0] == char:
        first_index = 0
    else:
        rec_answer = char_first_index(string[1:],char)
        if rec_answer is not None:
            first_index = 1 + rec_answer
    return first_index



