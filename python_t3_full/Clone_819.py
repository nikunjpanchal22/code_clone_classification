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
	for item in dictionary.items():
		key = item[0]
		value = item[1]
		if type(value) == dict and not sorted(value.keys()) == ['path_to_file', 'sha512sum']:
			modules.extend(_get_modules_from_db(value))
		else:
			modules.append(value)
	return modules


