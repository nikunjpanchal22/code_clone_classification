def n_letter_dictionary(string) :
	result = {}
	for key, group in groupby(sorted(string.split(), key = lambda x : len(x)), lambda x : len(x)) :
		result [key] = list(group)
	return result




def n_letter_dictionary(string):
    result = {}
    word_list = string.split()
    for word in word_list:
        length = len(word)
        if length not in result:
            result[length] = [word]
        else:
            result[length].append(word)
    return result


