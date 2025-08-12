def n_letter_dictionary(string) :
	result = {}
	for key, group in groupby(sorted(string.split(), key = lambda x : len(x)), lambda x : len(x)) :
		result [key] = list(group)
	return result


  def n_letter_dictionary(string):
    result = {}
    for idx, w in enumerate(string.split()):
        key = len(w)
        if key in result.keys():
            result[key].append(w)
        else:
            result[key] = [w]
    return result


