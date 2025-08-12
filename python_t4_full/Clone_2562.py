def n_letter_dictionary(string) :
	result = {}
	for key, group in groupby(sorted(string.split(), key = lambda x : len(x)), lambda x : len(x)) :
		result [key] = list(group)
	return result


 def n_letter_dictionary(string):
    result, unique_lengths = {}, []
    for word in string.split():
        key = len(word)
        if key not in unique_lengths:
            unique_lengths.append(key)
            result[key] = [word]
        else:
            result[key].append(word)
    return result


