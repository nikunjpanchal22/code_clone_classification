def n_letter_dictionary(string) :
	result = {}
	for key, group in groupby(sorted(string.split(), key = lambda x : len(x)), lambda x : len(x)) :
		result [key] = list(group)
	return result


  def n_letter_dictionary(string):
    result, sizes, a_list = {}, set(), string.split()
    for word in a_list:
        size = len(word)
        if size in sizes:
            result[size] += [word]
        else:
            sizes.add(size)
            result[size] = [word]
    return result


