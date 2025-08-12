def n_letter_dictionary(string) :
	result = {}
	for key, group in groupby(sorted(string.split(), key = lambda x : len(x)), lambda x : len(x)) :
		result [key] = list(group)
	return result



def n_letter_dictionary(string):
    result = {}
    for word in string.split():
        length = len(word)
        if length in result:
            result[length].append(word)
        else:
            result[length] = [word]


