def n_letter_dictionary(string) :
	result = {}
	for key, group in groupby(sorted(string.split(), key = lambda x : len(x)), lambda x : len(x)) :
		result [key] = list(group)
	return result


 def n_letter_dictionary(string):
    result = {}
    for length in set(map(len, string.split())):
        words = [word for word in string.split() if len(word) == length]
        result[length] = words
    return result


