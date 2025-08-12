def n_letter_dictionary(string) :
	result = {}
	for key, group in groupby(sorted(string.split(), key = lambda x : len(x)), lambda x : len(x)) :
		result [key] = list(group)
	return result


 def n_letter_dictionary(string):
    result = {}
    for group in groupby(string.split(), lambda x: len(x)):
        result[group[0]] = list(group[1])
    return result


