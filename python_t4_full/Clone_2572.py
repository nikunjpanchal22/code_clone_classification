def n_letter_dictionary(string) :
	result = {}
	for key, group in groupby(sorted(string.split(), key = lambda x : len(x)), lambda x : len(x)) :
		result [key] = list(group)
	return result


  def n_letter_dictionary(string):
    result = {}
    length_words = map(lambda x : len(x), string.split())
    for idx,group in itertools.groupby(sorted(length_words), key=len):
        result[idx] = list(filter(lambda x : len(x) == idx, string.split()))
    return result


