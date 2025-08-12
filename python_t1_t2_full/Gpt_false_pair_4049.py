def _get_modules_from_db(dictionary) :
	leaves = []
	for k, v in dictionary.iteritems() :
		if (isinstance(v, dict) and
		not sorted(v.keys()) == ['path_to_file', 'sha512sum']) :
			leaves.extend(_get_modules_from_db(v))
		else :
			leaves.append(v)
	return leaves




def _find_modules_from_db(dictionary) :
	leaves = []
	for key, value in dictionary.iteritems() :
		if (isinstance(value, dict) and
		not sorted(value.keys()) == ['path_to_file', 'sha512sum']) :
			leaves.extend(_find_modules_from_db(value))
		else :
			leaves.append(value)
	return leaves 

