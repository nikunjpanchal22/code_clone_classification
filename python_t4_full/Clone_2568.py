def n_letter_dictionary(string) :
	result = {}
	for key, group in groupby(sorted(string.split(), key = lambda x : len(x)), lambda x : len(x)) :
		result [key] = list(group)
	return result


  def n_letter_dictionary(string):
    result = dict.fromkeys([len(word) for word in string.split()], None)
    for key in result:
        result[key] = [word for word in string.split() if len(word) == key]
    return result


