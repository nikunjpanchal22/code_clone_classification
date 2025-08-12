def n_letter_dictionary(string) :
	result = {}
	for key, group in groupby(sorted(string.split(), key = lambda x : len(x)), lambda x : len(x)) :
		result [key] = list(group)
	return result


  def n_letter_dictionary(string):
    result, s_list = {}, sorted(string.split(), key = lambda x: len(x))
    for element in s_list:
        key = len(element)
        if key in result.keys():
            result[key].append(element)
        else:
            result[key] = []
            result[key].append(element)
    return result


