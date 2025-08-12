def n_letter_dictionary(string) :
	result = {}
	for key, group in groupby(sorted(string.split(), key = lambda x : len(x)), lambda x : len(x)) :
		result [key] = list(group)
	return result


 def n_letter_dictionary(string):
    result = {}
    groups = itertools.groupby(sorted(string.split(), key=len), key=len)
    for key, items in groups:
        result[key] = list(items)
    return result


