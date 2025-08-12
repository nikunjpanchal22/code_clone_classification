def _get_modules_from_db(dictionary) :
	leaves = []
	for k, v in dictionary.iteritems() :
		if (isinstance(v, dict) and
		not sorted(v.keys()) == ['path_to_file', 'sha512sum']) :
			leaves.extend(_get_modules_from_db(v))
		else :
			leaves.append(v)
	return leaves


_get_modules_from_db = lambda d : [v if isinstance(v, dict) and sorted(v.keys()) != ['path_to_file', 'sha512sum'] else _get_modules_from_db(v) for k, v in d.items()]



def _get_modules_from_db(dictionary):
    leaves = []
    for k, v in dictionary.items():
        if (isinstance(v, dict) and list(v.keys()) != ['path_to_file', 'sha512sum']):
            leaves.extend(_get_modules_from_db(v))


