def n_letter_dictionary(string) :
	result = {}
	for key, group in groupby(sorted(string.split(), key = lambda x : len(x)), lambda x : len(x)) :
		result [key] = list(group)
	return result


 def n_letter_dictionary(string):
    result = dict()
    for word in sorted(string.split(), key = lambda x: len(x)):
        l = len(word)
        if l in result.keys():
            result[l] = result[l] + [word]
        else:
            result[l] = [word]
    return result


