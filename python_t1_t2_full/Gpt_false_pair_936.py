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
	modules = []
	for keys, values in dictionary.items():
		if isinstance(values, dict) and not list(values.keys()) == ['path_to_file', 'sha512sum']: 
			modules.extend(_get_modules_from_db(values))
		else:
			modules.append(values)
	return modules
