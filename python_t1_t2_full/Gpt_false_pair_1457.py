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
    if len(string) == 0:
        return None
    if char == string[0]:
        return 0
    ind = char_first_index(string[1:], char)
    if ind is not None:
        return 1 + ind
    else:
        return None

