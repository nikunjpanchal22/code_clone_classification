def n_letter_dictionary(string) :
	result = {}
	for key, group in groupby(sorted(string.split(), key = lambda x : len(x)), lambda x : len(x)) :
		result [key] = list(group)
	return result


    return result


def n_letter_dictionary(string):
    result = {}
    for word in string.split():
        result.setdefault(len(word), []).append(word)
    return result


def n_letter_dictionary(string):
    words = string.split()


