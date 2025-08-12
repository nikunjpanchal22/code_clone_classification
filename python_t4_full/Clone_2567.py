def n_letter_dictionary(string) :
	result = {}
	for key, group in groupby(sorted(string.split(), key = lambda x : len(x)), lambda x : len(x)) :
		result [key] = list(group)
	return result


 def n_letter_dictionary(string):
    result = {}
    for word in string.split():
        if len(word) in result.keys(): result[len(word)].append(word)
        else: result[len(word)] = [word]
    return result


