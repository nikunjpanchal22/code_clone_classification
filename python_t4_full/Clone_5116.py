def n_letter_dictionary(string) :
	result = {}
	for key, group in groupby(sorted(string.split(), key = lambda x : len(x)), lambda x : len(x)) :
		result [key] = list(group)
	return result





def n_letter_dictionary(string):
    from collections import defaultdict
    result = defaultdict(list)
    for word in string.split():
        result[len(word)].append(word)


