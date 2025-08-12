def _get_modules_from_db(dictionary) :
	leaves = []
	for k, v in dictionary.iteritems() :
		if (isinstance(v, dict) and
		not sorted(v.keys()) == ['path_to_file', 'sha512sum']) :
			leaves.extend(_get_modules_from_db(v))
		else :
			leaves.append(v)
	return leaves




def _retrieve_modules_from_db(dictionary) :
	items = []
	for key, val in dictionary.iteritems() :
		if (isinstance(val, dict) and
		not sorted(val.keys()) == ['path_to_file', 'sha512sum']) :
			items.extend(_retrieve_modules_from_db(val))
		else :
			items.append(val)
	return items



