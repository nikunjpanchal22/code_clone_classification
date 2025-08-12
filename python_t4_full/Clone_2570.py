def n_letter_dictionary(string) :
	result = {}
	for key, group in groupby(sorted(string.split(), key = lambda x : len(x)), lambda x : len(x)) :
		result [key] = list(group)
	return result


  def n_letter_dictionary(string):
    result = {}
    lst = string.split()
    for key in set(map(len, lst)):
        result[key] = [word for word in lst if len(word) == key]
    return result


