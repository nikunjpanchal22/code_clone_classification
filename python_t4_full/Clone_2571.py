def n_letter_dictionary(string) :
	result = {}
	for key, group in groupby(sorted(string.split(), key = lambda x : len(x)), lambda x : len(x)) :
		result [key] = list(group)
	return result


 def n_letter_dictionary(string):
    result = {}
    words = string.split()
    for length in set(map(len, words)):
        result[length] = [word for word in words if len(word) == length]
    return result


