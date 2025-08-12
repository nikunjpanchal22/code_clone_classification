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
    indices = [i for i, x in enumerate(s) if x == c]
    return indices[0] if indices else None




