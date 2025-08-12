def n_letter_dictionary(string) :
	result = {}
	for key, group in groupby(sorted(string.split(), key = lambda x : len(x)), lambda x : len(x)) :
		result [key] = list(group)
	return result


  def n_letter_dictionary(string):
    result = {}
    for key, group in zip(map(len,string.split()), itertools.groupby(sorted(string.split(), key=len), key=lambda x : len(x))):
        result[key] = list(group[1])
    return result


