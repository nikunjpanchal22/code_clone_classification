def n_letter_dictionary(string) :
	result = {}
	for key, group in groupby(sorted(string.split(), key = lambda x : len(x)), lambda x : len(x)) :
		result [key] = list(group)
	return result


  def n_letter_dictionary(string):
    key_list = []
    result = {}
    for word in sorted(string.split(), key = lambda x: len(x)):
        key = len(word)
        if key in key_list:
            result[key].append(word)
        else:
            key_list.append(key)
            result[key] = [word]
    return result


