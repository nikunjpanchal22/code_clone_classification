def n_letter_dictionary(string) :
	result = {}
	for key, group in groupby(sorted(string.split(), key = lambda x : len(x)), lambda x : len(x)) :
		result [key] = list(group)
	return result


    return len_dict


def n_letter_dictionary(string):
    words = string.split()
    sorted_dict = {}


