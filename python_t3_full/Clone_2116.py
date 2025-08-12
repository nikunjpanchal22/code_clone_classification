def _get_modules_from_db(dictionary) :
	leaves = []
	for k, v in dictionary.iteritems() :
		if (isinstance(v, dict) and
		not sorted(v.keys()) == ['path_to_file', 'sha512sum']) :
			leaves.extend(_get_modules_from_db(v))
		else :
			leaves.append(v)
	return leaves




def _get_modules_from_db(dictionary):
    leaves = list()
    for k,v in dictionary.items():
        if (isinstance(v,dict) and 'path_to_file' not in v and 'sha512sum' not in v):
            leaves += _get_modules_from_db(v)
        else:
            leaves.append(v)
    return leaves




